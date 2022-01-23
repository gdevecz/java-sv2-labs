package collectionsiterator;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeSchooling {

    List<OnlineLesson> lessons = new LinkedList<>();

    public void addNewLesson(OnlineLesson lesson) {
        if (lessons.isEmpty()) {
            lessons.add(lesson);
            return;
        }
        int index = -1;
        for (int i = 0; i < lessons.size(); i++) {
            if (lesson.getStartTime().isBefore(lessons.get(i).getStartTime())) {
                if (index == -1) {
                    index = i;
                } else {
                    if (lessons.get(index).getStartTime().isAfter(lessons.get(i).getStartTime())) {
                        index = i;
                    }
                }
            }
        }
        if (index == -1) {
            lessons.add(lesson);
        }else {
            lessons.add(index, lesson);
        }
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        List<OnlineLesson> result = new LinkedList<>();
        while (iterator.hasNext()) {
            OnlineLesson actual = iterator.next();
            if (title.equals(actual.getLessonTitle())) {
                result.add(actual);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson actual = iterator.next();
            if (startTime.equals(actual.getStartTime())) {
                lessons.remove(actual);
            }
        }
    }

    public List<OnlineLesson> getLessons() {
        return lessons;
    }
}
