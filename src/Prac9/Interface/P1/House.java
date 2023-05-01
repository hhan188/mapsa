package Prac9.Interface.P1;

public class House implements Sortable{
    private String ownerName;
    private int area;

    public House(int area, String ownerName) {
        this.area = area;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public int getSortableProp() {
        return area;
    }

    @Override
    public int compare(Sortable object) {
        House house = (House) object;
        if (area > house.getArea())
            return 1;
        else if (area < house.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return ownerName + " house : \n" + "area => " + area;
    }
}
