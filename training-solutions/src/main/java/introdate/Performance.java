package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private LocalDate dateOfShow;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(
            String artist,
            int year,
            int month,
            int day,
            int startTime,
            int endTime) {

        this.dateOfShow = LocalDate.of(year, month, day);
        this.artist = artist;
        this.startTime = LocalTime.of(startTime, 0);
        this.endTime = LocalTime.of(endTime, 0);
    }

    public LocalDate getDateOfShow() {
        return dateOfShow;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

}
