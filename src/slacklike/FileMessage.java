package slacklike;

public class FileMessage extends Message implements Downloadable{
    private String fileName;
    public FileMessage(String author, String fileName) {
        super(author);
        this.fileName=fileName;
    }

    @Override
    public void Download() {
        System.out.println("Item is downloaded.\n" +
                "Type: File, Name: "+getFileName()+"Timestamp: "+getTimestamp());

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show(){
        System.out.println("ID: "+getID()+"Type: File Message, Author"+getAuthor()+"File Name: "+getFileName()+"   -|"+getTimestamp());
    }
}
