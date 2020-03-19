package shejimoshi.danlimoshi;

public class TaskManager {
    private  static  TaskManager tm=null;
    public TaskManager() {
    }

    public void displayProcesses() {

    }

    public void dispalyServices() {

    }

    public static TaskManager getInstance() {
        if (tm == null) {
            tm=new TaskManager();
        }
        return tm;
    }
}
