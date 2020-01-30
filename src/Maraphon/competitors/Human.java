package Maraphon.competitors;

import Maraphon.competitors.Competitor;

public class Human implements Competitor {
    String name;
    final String type = "Человек";

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name, 2000, 2);
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
