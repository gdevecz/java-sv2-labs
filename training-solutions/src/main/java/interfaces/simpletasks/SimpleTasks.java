package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable {

    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (nextStep());
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        if (tasks.isEmpty()) {
            return false;
        }
        tasks.remove(tasks.size() - 1);
        return true;
    }
}
