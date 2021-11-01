package formatlocaleprintf;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {

    private String name;

    private List<Double> kms;

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double kms) {
        this.kms.add(kms);
        printFormattedRunText();
    }


    public void printFormattedRunText() {
        System.out.printf("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %f km-t futottál. " +
                "Csak így tovább!\n", name, LocalDate.now().toString(), kms.size(), kms.get(kms.size() - 1));
    }
}
