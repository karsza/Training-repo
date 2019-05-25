import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Task t = new Task("ToDoApp", Status.INPROGRESS);
        try {
            // convert user object to json string and return it
            System.out.println(mapper.writeValueAsString(t));
        }
        catch (java.io.IOException e) {
            // catch various errors
            e.printStackTrace();
        }



    }
}
