package io.hexlet.xo.model;

import java.awt.*;

public class Field {
    private static final int FILE_SIZE = 3;

    private  final  Figure[][] Field = new Figure[FILE_SIZE][FILE_SIZE];

    public int getSize(){
        return FILE_SIZE;
    }

    public Figure getFigure(final Point point){
        return Field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure){
        Field[point.x][point.y] = figure;

    }
}
