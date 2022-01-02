package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter{

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String item : billItems) {
            String[] tmp = item.split(";");
            sb.append(tmp[0]).append(", ").append(tmp[2]).append(" * ").append(tmp[1]).append(" = ")
                    .append(Integer.parseInt(tmp[1]) * Integer.parseInt(tmp[2])).append(" Ft\n");
        }
        return sb.toString();
    }
}
