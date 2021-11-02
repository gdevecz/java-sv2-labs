package meetingroom;

public class MeetingRoom {

    private String name;

    private int length;

    private int width;

    private boolean reserved;

    public MeetingRoom(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
        reserved = false;
    }

    public void setReserved(){
        reserved = true;
    }

    public void setFree() {
        reserved = false;
    }

    public int getArea(){
        return length * width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isReserved() {
        return reserved;
    }
}
