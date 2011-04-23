package mastermind.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Area {

    public FigureFactory factory;
    private List<Guess> list = new ArrayList<Guess>();
    private int size;

    public Area(FigureFactory factory, int size) {
        this.factory = factory;
        this.size = size;
    }
    
    // Objekte nun nicht mehr löschbar aber können verändert werden !!!
    public List<Guess> getList(){
        return Collections.unmodifiableList(list);
    }

    public void addGuess(Guess guess) {
        if (!list.contains(guess))
            list.add(guess);
    }

    public Guess newDefaultGuess() {
        return Guess.newRandomGuess(factory, size);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Size: " + size);
        for (Guess guess : list) {
            buffer.append("\n");
            buffer.append(guess);
        }
        return buffer.toString();
    }

}
