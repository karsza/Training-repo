//
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//
//public class Main {
//    public static void main(String[] args) {
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        Task t = new Task("1", Status.INPROGRESS);
//        try {
//            // convert user object to json string and return it
//            System.out.println(mapper.writeValueAsString(t));
//        }
//        catch (JsonGenerationException | JsonMappingException e) {
//            // catch various errors
//            e.printStackTrace();
//        }
//
//
//
//    }
//}
