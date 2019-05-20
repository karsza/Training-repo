import java.util.ArrayList;

public class ToDo {
//to jason
    ArrayList<Task> toDoList;

    public ToDo (){
        toDoList = new ArrayList<>();
    }
    public boolean addTask (Task task){
        if (this.toDoList.contains(task)){
            return false;
        }
        else this.toDoList.add(task);
        return true;
    }

}
