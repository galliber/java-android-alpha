package slacklike;

import java.sql.Timestamp;
import java.util.List;

public abstract class Message {
    private int ID;
    private Timestamp timestamp;
    private String author;

    public Message(String author) {
        setTimestamp();
        this.author = author;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp() {
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setID(int id){
        this.ID=id;
    }

    public int getID(){
        return this.ID;
    }

    public abstract void show();
}
