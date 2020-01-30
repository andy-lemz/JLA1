package Maraphon.obstacle;

import Maraphon.competitors.Competitor;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
