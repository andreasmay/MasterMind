package mastermind.test;

import java.util.List;

import junit.framework.Assert;

import mastermind.domain.Area;
import mastermind.domain.Colour;
import mastermind.domain.FigureFactory;
import mastermind.domain.Guess;
import mastermind.domain.IllegalFigureException;
import mastermind.domain.Type;

import org.junit.Test;

public class datastruct {

    @Test(expected = IllegalFigureException.class)
    public void generateFigure() throws IllegalFigureException {
        // Colors & Types gen.
        List<Colour> colors = Colour.newColorList(Colour.BLACK);
        List<Type> types = Type.newTypeList(Type.STICK);
        FigureFactory factory = new FigureFactory(colors, types);

        Guess guess = new Guess(4);

        guess.setFigure(0, factory.newFigure(Colour.BLUE, Type.STICK));
    }

    @Test
    public void generateRandomGuess() {
        List<Colour> colors = Colour.newColorList(Colour.BLACK, Colour.WHITE, Colour.BLUE);
        List<Type> types = Type.newTypeList(Type.CYRCLE, Type.SQUARE, Type.STICK);

        FigureFactory factory = new FigureFactory(colors, types);

        Guess guess1 = Guess.newRandomGuess(factory, 4);
        Guess guess2 = Guess.newRandomGuess(factory, 4);
        System.out.println(guess1);
        System.out.println(guess2);
    }

    @Test
    public void equalsGuess() throws IllegalFigureException {
        // Erlaubte colors / types: BLACK WHITE BLUE / CYRCLE SQUARE STICK
        List<Colour> colors = Colour.newColorList(Colour.BLACK, Colour.WHITE, Colour.BLUE);
        List<Type> types = Type.newTypeList(Type.CYRCLE, Type.SQUARE, Type.STICK);

        FigureFactory factory = new FigureFactory(colors, types);

        Guess guess1 = new Guess(4);
        Guess guess2 = new Guess(4);

        guess1.setFigure(0, factory.newFigure(Colour.BLACK, Type.CYRCLE));
        guess2.setFigure(3, factory.newFigure(Colour.WHITE, Type.CYRCLE));

        Assert.assertFalse(guess1 == guess2);
    }

    @Test
    public void matze() {
        List<Colour> colors = Colour.newColorList(Colour.BLACK, Colour.BLUE);
        List<Type> types = Type.newTypeList(Type.SQUARE);

        FigureFactory factory = new FigureFactory(colors, types);

        Area area = new Area(factory, 4);
        Guess.resetCounter();
        // Guess guess = new Guess(4);
        Guess guess = area.newDefaultGuess();
        Guess guess2 = Guess.newRandomGuess(factory, 4);
        area.addGuess(guess);
        area.addGuess(guess2);
        
        System.out.println(area);
   }
}
