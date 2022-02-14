package optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {

    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        return courses.stream()
                .filter(c -> c.getPrice() <= maxPrice)
                .sorted(Comparator.comparing(Course::getPrice))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        return courses.stream()
                .filter(c -> c.getName().equals(name) && c.getLevel() == level)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such course."))
                .getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> result = Optional.empty();
        for (Course course : courses) {
            if (course.getLevel() == level) {
                result = Optional.of(course.getName());
            }
        }
        return result.orElse("Sorry, there is no course at this level.");
    }
}
