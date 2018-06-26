package chess;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private int[][] field;
    private List<Figure> figures;

    public Field(int[][] field){
        this.field=new int[8][8];
        this.figures=new ArrayList<Figure>();
    }
    public Field(){

    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}

