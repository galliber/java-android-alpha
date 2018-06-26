package chess;

public class Horse extends Figure {
    public Horse(int x, int y, Field field) {
        super(x, y, field);
    }

    @Override
    public boolean isValidMove(int x, int y){
        if(x>7||y>7||x<0||y<0)
            return false;
        int[][] horseMoves={{x-2, y-1}, {x-2, y+1}, {x-1, y-2}, {x-1, y+2}, {x+1, y-2}, {x+1, y+2}, {x+2, y-1}, {x+2, y+1}};
        //if(getField().getField()[x-1][])
        return false;
    }
}
