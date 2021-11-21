package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        List<String> toDos = new ArrayList<>();
        String answer;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Mi a következő teendő?\n %2d: ", counter++);
            answer = sc.nextLine();
            if(!answer.equals("x")) {
                toDos.add(answer);
            }
        } while (!answer.equals("x"));

        try {
            Files.write(Paths.get("src/main/resources/introexceptionwritefile/todos.txt"),toDos);
        } catch (IOException ioe){
            System.out.println("Can not write file!");
            ioe.printStackTrace();
        }
    }
}
