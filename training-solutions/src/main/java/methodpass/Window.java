package methodpass;

public class Window {

    private String roomName;

    private int width;

    private int height;

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    public void changeHeightWith(int plusSize) {
        height += plusSize;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
