package sorting;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient {

    private String name;

    private String ssn;

    private LocalDateTime date;

    public Patient(String name, String ssn, LocalDateTime date) {
        this.name = name;
        this.ssn = ssn;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
