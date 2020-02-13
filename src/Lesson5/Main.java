package Lesson5;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        float[] arr = new float[size];

        for (int i=0; i<arr.length; i++){
            arr[i]=1;
        }

        //Type 1
        long start1 = System.currentTimeMillis();
        ArrOperations op = new ArrOperations();
        op.mathOperation(arr, 0);
        long finish1 = System.currentTimeMillis()-start1;
        System.out.println("Один поток затратил: "+finish1);

        //  Опять забьём единицами
        for (int i=0; i<arr.length; i++){
            arr[i]=1;
        }

        //Type 2
        long start2 = System.currentTimeMillis();
        parallelOperations(arr);
        long finish2 = System.currentTimeMillis()-start2;
        System.out.println("Два потока затратили: "+finish2);

    }

    public static float[] parallelOperations(float[] arr){

        float[] ar1 = new float[h];
        float[] ar2 = new float[h];

        System.arraycopy(arr, 0, ar1, 0, h);
        System.arraycopy(arr, h, ar2, 0, h);

        ArrOperations op = new ArrOperations();
        Thread t1 =new Thread(() ->{
            op.mathOperation(ar1, 0);
        });

        Thread t2 =new Thread(() ->{
            op.mathOperation(ar2, h);
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(ar1, 0, arr, 0, h);
        System.arraycopy(ar2, 0, arr, h, h);

        return arr;
    }

    /*public float[] mathOperation(float[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        return arr;
    }*/

}
