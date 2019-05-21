import java.util.ArrayList;
import java.util.Objects;

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
    public boolean removeTask (Task taskToDelete){
        if (this.toDoList.contains(taskToDelete)){
            toDoList.remove(taskToDelete);
            return true;
        }
        return false;
    }
    public Task findTask (Task taskToBeFound){
        for (Task taskX : this.toDoList) {
            if (taskX.equals(taskToBeFound))
                return taskX;
        }
        return null;
    }
    //find by partial or full string
    //add tests
    public ArrayList<Task> findTaskBySubject (String word){
        ArrayList<Task> list = new ArrayList<>();
        for (Task taskX : this.toDoList){
            if (taskX.getSubject().contains(word)){
                list.add(taskX);
            }
        }
        return list;
    }
    public ArrayList<Task> findTaskByStatus (Enum status){
        ArrayList<Task> list = new ArrayList<>();
        for (Task taskX : this.toDoList){
            if (taskX.getStatus().equals(status)){
                list.add(taskX);
            }
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDo)) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(toDoList, toDo.toDoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(toDoList);
    }
}
