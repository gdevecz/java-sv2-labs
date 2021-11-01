package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class IceCream {

    private List<String> iceCreams = new ArrayList<>();

    public List<String> getIceCreams() {
        return iceCreams;
    }

    public String getSpecialPrice() {
        StringBuilder sb = new StringBuilder("Ma kapható: ");
        for (int i = 0; i < iceCreams.size(); i++) {
            if (i != 0){
                sb.append(", ");
            }
            sb.append(iceCreams.get(i));
        }
        sb.append(". Gyerekeknek féláron!");
        return sb.toString();
    }
}
