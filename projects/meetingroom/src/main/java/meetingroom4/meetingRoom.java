package meetingroom4;

public class meetingRoom {

    private String name;

    private int length;

    private int width;

    public meetingRoom(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }


    @Override
    public String toString() {
        return name
                + " szélessége " + width
                + " m, hosszúsága " + length
                + " m, területe " + getArea() + " m\u00B2";
    }

    public int getArea() {
        return length * width;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
