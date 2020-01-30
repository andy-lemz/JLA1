package Maraphon.competitors;

public class Robot implements Competitor {
    String name;
    final String type = "Киборг-убийца";

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Robot(String name) {
        this(name, 5000, 30);
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
