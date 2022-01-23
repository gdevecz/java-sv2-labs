package searching;

import java.time.LocalDate;

public class LostProperty implements Comparable<LostProperty> {

    private String regNumber;

    private String description;

    private LocalDate date;

    public LostProperty(String regNumber, String description, LocalDate date) {
        this.regNumber = regNumber;
        this.description = description;
        this.date = date;
    }

    public LostProperty(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int compareTo(LostProperty o) {
        if (this.description.equals(o.description)) {
            return this.date.compareTo(o.date);
        }
        return this.description.compareTo(o.description);
    }
}
