package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();
        note.setName("Troppauer Hümér");
        note.setTopic("Anyám, te vagy árva fiad csillaga");
        note.setText("Első ének...");

        System.out.println(note.getNoteText());
    }
}
