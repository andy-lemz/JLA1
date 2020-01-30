package Maraphon.competitors;

public class Cat implements Competitor {

    String name;
    final String type = "Котя";

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Cat(String name) {
        this(name, 500, 7);
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name+" "+active);
    }

    @Override
    public void run( int dist){
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно пробежал");
        } else {
            active = false;
            System.out.println(type + " " + name + " не прошел тест на бег");
        }

    }

    @Override
    public void jump( int height){
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул");
        } else {
            active = false;
            System.out.println(type + " " + name + " не прошел тест на прыжок");
        }
    }
}
