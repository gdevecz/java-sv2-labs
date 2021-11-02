package controlselection.week;

public class DayOfWeeks {

    //nem tudom hogy így elfogadott-e a kód, a break-el le sem fordítja, ha kell átírom, nem áll semmiből
    public String commentDAyOfWeek(String string) {
        switch (string.toLowerCase()) {
            case "hétfő":
                return "hét eleje";
//                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat" :
            case "vasárnap" :
                return "hét vége";
            default:
                return "ismeretlen nap";
        }
    }
}
