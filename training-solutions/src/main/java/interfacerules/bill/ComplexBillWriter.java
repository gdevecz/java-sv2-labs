package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{


    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String item : billItems) {
            String[] tmp = item.split(";");
            sb.append(tmp[0]).append("; darabszám: ").append(tmp[2]).append(", egységár: ").append(tmp[1]).append(", összesen: ")
                    .append(Integer.parseInt(tmp[1]) * Integer.parseInt(tmp[2])).append(" Ft\n");
        }
        return sb.toString();
    }
}
