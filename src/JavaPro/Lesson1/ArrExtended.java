package JavaPro.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrExtended {
    public static void main(String[] args) {
        String arrStr[] = {"Один", "Два", "Три"};
        Integer arrInt[] = {1,2,3};

        System.out.println(Arrays.toString(relocateElements(arrStr, 2, 0)));
        System.out.println(Arrays.toString(relocateElements(arrInt, 2, 0)));

        ArrayList listStr = arrToArrList(arrStr);
        System.out.println(listStr);
    }

    public static <T>T[] relocateElements(T[] arr, int index1, int index2){
        T tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

        return arr;
    }

    public static <T> ArrayList<T> arrToArrList(T[] arr) {
        ArrayList<T> arrList = new ArrayList<T>();
        for (T el:arr) {
            arrList.add(el);
        }

        return arrList;
    }
}
