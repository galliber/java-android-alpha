package chess;

public class Figure {
    private int count=0;
    private int x;
    private int y;
    private Field field;



    public Figure(int x, int y, Field field){

        this.x=x;
        this.y=y;
        this.field=field;
    }

    public boolean isValidMove(int x, int y){
        if(x>7||y>7||x<0||y<0)
            return false;
        if(field.getField()[x][y]!=0)
            return false;
        if(x==this.x+1||x==this.x-1)
            return true;
        else
            return false;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
