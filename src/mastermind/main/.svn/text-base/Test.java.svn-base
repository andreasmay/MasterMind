package mastermind.main;

import java.util.List;

import mastermind.domain.Colour;
import mastermind.domain.FigureFactory;
import mastermind.domain.Guess;
import mastermind.domain.IllegalFigureException;
import mastermind.domain.Type;

public class Test {

    public static void main(String arg[]) {
        List<Colour> colors = Colour.newColorList(Colour.BLACK, Colour.WHITE, Colour.BLUE);
        List<Type> types = Type.newTypeList(Type.CYRCLE, Type.SQUARE, Type.STICK);

        // Guess guess = new Guess(4);

        FigureFactory factory = new FigureFactory(colors, types);

        // guess.setFigure(1, factory.newFigure(Color.WHITE, Type.CYRCLE));
        // guess.setFigure(0, factory.randomFigure());
        // System.out.println(factory.newFigure(Color.GREEN, Type.CYRCLE));
        // System.out.println(factory.randomFigure());
        Guess guess1 = Guess.newRandomGuess(factory, 4);
        Guess guess2 = Guess.newRandomGuess(factory, 4);
        System.out.println(guess1);
        System.out.println(guess2);
        
        Guess guess3 = new Guess(4);
        Guess guess4 = new Guess(4);
        
        try {
            guess3.setFigure(1, factory.newFigure(Colour.WHITE, Type.STICK));
            guess4.setFigure(1, factory.newFigure(Colour.WHITE, Type.STICK));
        } catch (IllegalFigureException event) {
            // TODO Auto-generated catch block
            event.printStackTrace();
        }
        System.out.println(guess3.equals(guess4));
    }

}
