package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.AlreadyQccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getSize() {
        final Field field = new Field();
        assertEquals(3, field.getSize());
    }

    @Test
    public void setFigure() throws Exception{
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }

    @Test
    public void testGetFigureWhenIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }
}