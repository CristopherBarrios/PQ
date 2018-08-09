package Map;

import java.util.ArrayList;
import Pared.Pared;
import carro.carro;

public class Map {
    private int width;
    private int height;
    private carro robot;
    private ArrayList<Pared> walls;


    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.walls = new ArrayList<Pared>();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Pared getRobot() {
        return carro;
    }

    public void addRobot(carro robot) {
        this.robot = robot;
    }

    public void addWall(Pared wall) {
        this.walls.add(wall);
    }


    public boolean hasWallAt(int x, int y) {
        for(Pared wall : this.walls) {
            if (wall.getX() == x && wall.getY() == y) {
                return true;
            }
        }

        return false;
    }


    private boolean executeMove() {
        int rx = this.robot.getX();
        int ry = this.robot.getY();
        int rd = this.robot.getDirection();

        switch(rd) {
            case 0:
                if (ry > 0 && !this.hasWallAt(rx, ry - 1)) {
                    this.robot.mover();
                    return true;
                }

                return false;
            case 1:
                if (rx < (this.width - 1) && !this.hasWallAt(rx + 1, ry)) {
                    this.robot.mover();
                    return true;
                }

                return false;
            case 2:
                if (ry < (this.height - 1) && !this.hasWallAt(rx, ry + 1)) {
                    this.robot.mover();
                    return true;
                }

                return false;
            default:
                if (rx > 0 && !this.hasWallAt(rx - 1, ry)) {
                    this.robot.mover();
                    return true;
                }

                return false;
        }
    }

    public boolean executeAction(String action) {
        if (this.robot == null) {
            return false;
        }

        switch(action) {
            case "MOVE":
                return this.executeMove();
            case "ROTATE":
                this.robot.rotar();
                return true;
            default:
                return false;
        }
    }


}
