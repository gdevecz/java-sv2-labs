package enumtype.firstenum.university;

public enum University {

    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"),
    SOTE("Semmelweis Egyetem"),
    ELTE("Eötvös Loránd Tudományegyetem"),
    PE("Pannon Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
