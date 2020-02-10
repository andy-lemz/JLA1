package Lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class ChatWindow {
    @FXML
    public TextArea chat;
    @FXML
    public TextArea yourMessage;

    public void sendMessage() {
        chat.appendText("Вы: "+yourMessage.getText()+"\n");
        yourMessage.clear();
        chat.appendText("Собеседник: Ясненько"+"\n");
    }

    public void keyLog(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sendMessage();
        }
    }
}
