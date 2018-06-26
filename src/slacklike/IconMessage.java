package slacklike;

public class IconMessage extends Message {
    private IconType iconType;

    public IconMessage(String author, IconType iconType) {
        super(author);
        this.iconType=iconType;
    }

    public IconType getIconType() {
        return iconType;
    }

    public void setIconType(IconType iconType) {
        this.iconType = iconType;
    }

    @Override
    public void show(){
        System.out.println("ID: "+getID()+"Type: Icon Message, Author"+getAuthor()+"Icon Type: "+getIconType().toString()+"   -|"+getTimestamp());
    }
}
