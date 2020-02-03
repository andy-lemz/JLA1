package Lesson2;

public class MyArrayDataException extends IllegalArgumentException {

    int num1;
    int num2;

    public MyArrayDataException(String message, int num1, int num2){
        super(message);
        this.num1 = num1;
        this.num2 = num2;
    }

}
