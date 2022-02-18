package lambdacollectors.honey;

public class Honey {

    private HoneyType type;

    private GlassSize gless;

    public Honey(HoneyType type, GlassSize gless) {
        this.type = type;
        this.gless = gless;
    }

    public HoneyType getType() {
        return type;
    }

    public GlassSize getGless() {
        return gless;
    }
}
