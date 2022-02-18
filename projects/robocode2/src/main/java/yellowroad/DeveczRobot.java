package yellowroad;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;


public class DeveczRobot extends Robot {

    private double centerOfMapX;

    private double centerOfMapY;

    @Override
    public void run() {
        setCenterOfMap();
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        setBodyColor(Color.MAGENTA);
        System.out.println(getRadarHeading());
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }


    public void onPaint(Graphics2D g) {
        g.setColor(Color.red);
        g.drawOval((int) (getX() - 50), (int) (getY() - 50), 100, 100);
        g.setColor(new Color(0, 0xFF, 0, 30));
        g.fillOval((int) (getX() - 60), (int) (getY() - 60), 120, 120);
    }

    private void scanSittingDuck() {

    }

    private void setCenterOfMap(){
        centerOfMapX = halfOfDistance((double) getBattleFieldWidth());
        centerOfMapY = halfOfDistance((double) getBattleFieldHeight());
    }

    private double halfOfDistance(double distance) {
        return distance/2.0;
    }
}
