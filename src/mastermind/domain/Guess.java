package mastermind.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andreasmay
 * 
 */
public class Guess {

    private int tryNumber;
    private static int tryStart = 0;
    private List<Figure> list = new ArrayList<Figure>();

    public Guess(int size) {
        Guess.tryStart++;
        this.tryNumber = tryStart;
        list.addAll(Figure.defaultFigureList(size));
    }

    public static void resetCounter() {
        Guess.tryStart = 0;
    }

    /**
     * generate random guess ( count++ !! )
     * 
     * @param FigureFactory
     *            factory
     * @param size
     * @return
     */
    public static Guess newRandomGuess(FigureFactory factory, int size) {
        Guess rndGuess = new Guess(size);
        for (int i = 0; i < size; i++)
            rndGuess.setFigure(i, factory.randomFigure());
        return rndGuess;
    }

    public void setFigure(int pos, Figure figure) {
        list.set(pos, figure);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Guess try: " + tryNumber + "\n");
        for (Figure figure : list) {
            buffer.append(figure + "\n");
        }
        return buffer.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((list == null) ? 0 : list.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Guess other = (Guess) obj;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.containsAll(other.list)){
//            for ( int i = 0 ; i < list.size() ; i++ ){
//                if ( list.get(i).color != other.list.get(i).color)
//                    return false;
//                if ( list.get(i).type != other.list.get(i).type)
//                    return false;
//                
//            }
            System.out.println("hier");
            int i=0;
            for ( Figure figure : list){
                if (!(figure.equals(other.list.get(i))))
                    return false;
                i++;
            }
        }
        return true;
    }
    
    // :TODO Guess-Vergleich soll guess Object zur�ck liefern mit wei� / schwarz kombi ;)

}
