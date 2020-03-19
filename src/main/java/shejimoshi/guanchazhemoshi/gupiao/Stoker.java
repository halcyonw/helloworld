package shejimoshi.guanchazhemoshi.gupiao;

public class Stoker implements Observer {
private String name;
private Subject subject;

    public Stoker(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void response() {
        System.out.println("股票"+subject.getName()+"发生了变化"+subject.getPrice());
    }


    public Subject getsubject() {
        return subject;
    }

    public void setsubject(Subject subject) {
        this.subject = subject;
    }



}
