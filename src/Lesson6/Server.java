package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;

        try {
            server = new ServerSocket(8189);
            socket = server.accept();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Thread networkThread = new Thread(() -> {
                while (true) {
                    try {
                        String str = in.readUTF();
                        if (str.equals("/end")) {
                            //out.writeUTF("/end");
                            break;
                        }
                        System.out.println(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread keyboardInputThread = new Thread(()->{
                System.out.println("Ожидается ввод");
                Scanner input = new Scanner(System.in);
                while (true) {
                    try {
                        String msg = input.nextLine();
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            networkThread.start();
            keyboardInputThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

