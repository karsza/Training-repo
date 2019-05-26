//import org.codehaus.jackson.map.ObjectMapper;
//
//public class Main {
//    public static void main(String[] args) {
//
//        ObjectMapper mapper = new ObjectMapper();
//
//
//        Task t = new Task("ToDoApp", Status.INPROGRESS);
//        Task t1 = new Task ("Prepare soup",Status.INPROGRESS);
//        ToDo list = new ToDo();
//        list.addTask(t);
//        list.addTask(t1);
//
//        try {
//            // convert user object to json string and return it
//            System.out.println(mapper.writeValueAsString(list));
//        }
//        catch (java.io.IOException e) {
//            // catch various errors
//            e.printStackTrace();
//        }
//
//
//
//    }
//}
