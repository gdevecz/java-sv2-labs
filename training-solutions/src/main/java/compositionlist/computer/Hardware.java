package compositionlist.computer;

public class Hardware {

    private String name;

    private String model;

    public Hardware(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}