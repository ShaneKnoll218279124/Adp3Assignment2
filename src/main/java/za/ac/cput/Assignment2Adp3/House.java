package za.ac.cput.Assignment2Adp3;

public class House {
    private int HouseNumber;
    private String  Color;

    public House(int h , String c){
        HouseNumber=h;
        Color=c;
    }


    public House(String c){

        Color=c;

    }


    public int getHouseNumber() {
        return HouseNumber;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }

}
