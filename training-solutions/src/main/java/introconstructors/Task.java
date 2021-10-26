package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duraation) {
        this.duration = duraation;
    }

    public void start() {
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        // Amíg csak az alpértelmezett konstruktor van, és nincs getter setter sem, gyakorlatilag nem jó semmire
        // konstruktor megírása után 1 szabvvány konstruktora van a Task osztálynak.
        Task task = new Task("Matematika felzárkoztató", "Gyenge tanulók korrepetálása.");
        System.out.println("Task: " + task.title);
        System.out.println("Description: " + task.description);
        System.out.println("Duration: " + task.duration);
        System.out.println("Start: " + task.startDateTime);
        task.setDuration(120);
        task.start();
        System.out.println("Task: " + task.title);
        System.out.println("Description: " + task.description);
        System.out.println("Duration: " + task.duration);
        System.out.println("Start: " + task.startDateTime);

    }


}
