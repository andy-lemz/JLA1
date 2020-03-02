package JavaPro.Lesson1;

public class BoxOperation {
    public static void main(String[] args) {
        Box box1 = new Box(new Apple(),14);
        Box box2 = new Box(new Orange(), 14);

        box1.tryAdd(new Orange(), 10);
        box1.tryAdd(new Apple(), 7);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        System.out.println(box1.compare(box2));

        Box box3 = new Box(new Apple(), 2);
        box1.placeToAnotherBox(box2);
        box1.placeToAnotherBox(box3);
        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());

    }
}
