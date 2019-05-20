import java.util.Objects;

public class Task {
//tests
    //to jason
    private String subject;
    private String status;//to be enum

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task(String subject, String status) {
        this.subject = subject;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return Objects.equals(subject, task.subject) &&
                Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subject, status);
    }
}
