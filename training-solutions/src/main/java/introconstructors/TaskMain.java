package introconstructors;

public class TaskMain {

    public static void main(String[] args) {
        // Amíg csak az alpértelmezett konstruktor van, és nincs getter setter sem, gyakorlatilag nem jó semmire
        // konstruktor megírása után 1 szabvvány konstruktora van a Task osztálynak.
        Task task = new Task("Matematika felzárkoztató", "Gyenge tanulók korrepetálása.");
        System.out.println("Task: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Duration: " + task.getDuration());
        System.out.println("Start: " + task.getStartDateTime());
        task.setDuration(120);
        task.start();
        System.out.println("Task: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Duration: " + task.getDuration());
        System.out.println("Start: " + task.getStartDateTime());
    }
}
