package slacklike;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Chanel {
    private static final HashSet<String> CHANEL_NAMES=new HashSet<>();

    private List<Message> messages;
    private String name;

    public Chanel(String name){
        setName(name);
        this.messages=new ArrayList<>();
    }

    private void setName(String name){
        if(CHANEL_NAMES.contains(name))
            System.out.println("Name Taken!");
        else
            this.name=name;
    }

    public String getName() {
        return name;
    }

    public void addMessage(TextMessage textMessage){
        messages.add(textMessage);
    }

    public void addMessage(ImageMessage imageMessage){
        messages.add(imageMessage);
    }

    public void addMessage(IconMessage iconMessage){
        messages.add(iconMessage);
    }

    public void addMessage(FileMessage fileMessage){
        messages.add(fileMessage);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void listHistory(){
        for(Message m: messages)
            m.show();
    }

    public void clearHistory() {
        messages.clear();
    }
}
