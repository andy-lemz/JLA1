package Lesson2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {
                {"1","3","5","7"},
                {"2","4","6", "8"},
                {"9","7","5","3"},
                {"8","шесть","4","2"}
        };

        try {
            System.out.println(sumArray(arr));
        } catch (MyArraySizeException e)  {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());;
        }

    }

    static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        checkSizeArray(arr);
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < arr[i].length; j++){
                try {
                    int num = Integer.parseInt(arr[i][j]);
                    sum += num;
                } catch (NumberFormatException e) {
                   throw new MyArrayDataException("не удалось преобразовать в число значение "+arr[i][j]+" из ячейки ["+i+"]["+j+"]", i, j);
                }
            }
        }
        return sum;
    }
    
    static void checkSizeArray(String[][] arr) throws MyArraySizeException {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException("Строка массива "+i+" содержит "+arr[i].length+" элемента!");
            }
        }

        if (arr.length != 4){
            throw new MyArraySizeException("В массиве "+arr.length+" строк вместо четырёх!");
        }
    }

}
