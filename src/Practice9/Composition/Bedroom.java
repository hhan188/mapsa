package Practice9.Composition;

public class Bedroom {
    private String Wall1;
    private String Wall2;
    private String Wall3;
    private String Wall4;

    public Bedroom(String wall1, String wall2, String wall3, String wall4) {
        Wall1 = wall1;
        Wall2 = wall2;
        Wall3 = wall3;
        Wall4 = wall4;
    }

    public String getWall1() {
        return Wall1;
    }

    public void setWall1(String wall1) {
        Wall1 = wall1;
    }

    public String getWall2() {
        return Wall2;
    }

    public void setWall2(String wall2) {
        Wall2 = wall2;
    }

    public String getWall3() {
        return Wall3;
    }

    public void setWall3(String wall3) {
        Wall3 = wall3;
    }

    public String getWall4() {
        return Wall4;
    }

    public void setWall4(String wall4) {
        Wall4 = wall4;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "Wall1='" + Wall1 + '\'' +
                ", Wall2='" + Wall2 + '\'' +
                ", Wall3='" + Wall3 + '\'' +
                ", Wall4='" + Wall4 + '\'' +
                '}';
    }
}
