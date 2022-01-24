package collectionsclass;

import java.util.Objects;

public class ExamResult {

    private String name;

    private int result;

    public ExamResult(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return result == that.result && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, result);
    }
}
