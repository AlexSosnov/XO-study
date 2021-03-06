package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.AlreadyQccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class Field {
    private static final int FIELD_SIZE = 3;

    private static final int MIN_COORDINATE = 0;

    private static final int MAX_COORDINATE = FIELD_SIZE;

    private  final  Figure[][] Field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }
        return Field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException,
                                                                         AlreadyQccupiedException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }
        Field[point.x][point.y] = figure;

    }

    private boolean checkPoint(final Point point){
        return checkCoordinat(point.x) && checkCoordinat(point.y);
    }

    private boolean checkCoordinat(final int coordinate){
        return  coordinate >= MIN_COORDINATE && coordinate < FIELD_SIZE;
    }
}
