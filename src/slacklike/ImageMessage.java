package slacklike;

public class ImageMessage extends Message implements Likeable, Downloadable{
    private String imageName;
    private int likesCount;
    public ImageMessage(String author, String imageName) {
        super(author);
        this.imageName=imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void Download() {
        System.out.println("Item is downloaded.\n" +
                "Type: Image, name: "+getImageName()+"Timestamp: "+getTimestamp());

    }

    @Override
    public void Like() {
        this.likesCount++;
    }

    @Override
    public int getLikes(){
        return likesCount;
    }

    @Override
    public void show(){
        System.out.println("ID: "+getID()+", Type: Image Message, Author"+getAuthor()+", Likes: "+ getLikes()+", Image Name: "+getImageName()+"   -|"+getTimestamp());
    }
}
