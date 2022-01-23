package collectionsqueue;

import java.util.*;

public class ToDoList {

    private List<ToDo> toDos = new ArrayList<>();

    public void addToDo(ToDo newToDO) {
        toDos.add(newToDO);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo toDo : toDos) {
            if (toDo.isUrgent()) {
                result.addFirst(toDo);
            } else {
                result.add(toDo);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo(new ToDo("kenyeret venni", false));
        toDoList.addToDo(new ToDo("varrónő", true));
        toDoList.addToDo(new ToDo("gyereknek télikabát", false));
        toDoList.addToDo(new ToDo("autó olajcsere", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
    }
}
