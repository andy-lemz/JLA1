package Lesson5;

public class ArrOperations {

    public synchronized float[] mathOperation(float[] arr, int startI){

        for (int i=startI; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        return arr;
    }

}
