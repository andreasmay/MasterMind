package mastermind.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author andreasmay
 * 
 */
public class FigureFactory {
    
    List<Colour> colors = new ArrayList<Colour>();
    List<Type> types = new ArrayList<Type>();
    
    // Colors- Types- mšglichkeiten festlegen
    public FigureFactory(List<Colour> colors, List<Type> types) {
        this.colors.addAll(colors);
        this.types.addAll(types);
    }


    public Figure newFigure(Colour color, Type type) throws IllegalFigureException{
        if ( types.contains(type) && colors.contains(color))
            return new Figure(type,color);
        else
            throw new IllegalFigureException("type: " + type + " / color: " + color + " gibt es nicht!");
    }
    
    /**
     * @return rnd object von {@link Figure}
     */
    public Figure randomFigure(){
        List<Colour> rndColor = new ArrayList<Colour>();
        List<Type> rndType = new ArrayList<Type>();
        rndType.addAll(this.types);
        rndColor.addAll(this.colors);
        Collections.shuffle(rndColor);
        Collections.shuffle(rndType);
        
        return new Figure(rndType.get(0), rndColor.get(0) );
    }
    
    public List<Colour> allowedColors(){
        return colors;
    }
    
    public List<Type> allowedTypes(){
        return types;
    }
}
