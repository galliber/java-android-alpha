package slacklike;

public class TextMessage extends Message implements Likeable {
    private String field;
    private int likesCount;

    public TextMessage(String author, String field) {
        super(author);
        this.field = field;
        this.likesCount = 0;
    }

    @Override
    public void Like() {
        this.likesCount++;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public int getLikes() {
        return likesCount;
    }

    @Override
    public void show(){
        System.out.println("ID: "+getID()+", Type: Text Message, Author"+getAuthor()+", Likes: "+ getLikes()+", Field:\n         "+getField()+"   -|"+getTimestamp());
    }

}
