package practices.practice10.exercise37;

import com.google.gson.Gson;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom() {
    }

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Bedroom setName(String name) {
        this.name = name;
        return this;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Bedroom setWall1(Wall wall1) {
        this.wall1 = wall1;
        return this;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Bedroom setWall2(Wall wall2) {
        this.wall2 = wall2;
        return this;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Bedroom setWall3(Wall wall3) {
        this.wall3 = wall3;
        return this;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Bedroom setWall4(Wall wall4) {
        this.wall4 = wall4;
        return this;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bedroom setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
        return this;
    }

    public Bed getBed() {
        return bed;
    }

    public Bedroom setBed(Bed bed) {
        this.bed = bed;
        return this;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bedroom setLamp(Lamp lamp) {
        this.lamp = lamp;
        return this;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed |"+getBed());
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
