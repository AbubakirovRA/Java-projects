package OOP.Workshops.WP5;

public class User {
    private int id;
    private String login;
    private Status status;
    private static int count = 1;

    public User(String login){
        this.login = login;
        id = count++;
    }

    public int getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
}
