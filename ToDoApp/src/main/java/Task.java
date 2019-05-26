import org.codehaus.jackson.map.ObjectMapper;

import java.util.Objects;

public class Task {

    //to jason
    private String subject;
    private Status status;

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Task(String subject, Status status) {
        this.subject = subject;
        this.status = status;
    }
    public String toJson (){
        ObjectMapper mapper = new ObjectMapper();
        try {
            // convert user object to json string and return it
            return (mapper.writeValueAsString(this));
        }
        catch (java.io.IOException e) {
            // catch various errors
            e.printStackTrace();
        }
        return "";
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
