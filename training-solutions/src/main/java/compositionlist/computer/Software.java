package compositionlist.computer;

public class Software {

    private String name;

    private double version;

    public Software(String name, double version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return name + " ver.(" + version + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
