package mastermind.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Fields: - {@link Type} - {@link Colour}
 * 
 * @author andreasmay
 * 
 */
public class Figure {
    Type type;
    Colour color;

    Figure(Type type, Colour color) {
        this.type = type;
        this.color = color;
    }

    /**
     * generate x Figuren (CYRCLE/BLACK)
     * 
     * @param size
     * @return List<Figure>
     */
    public static List<Figure> defaultFigureList(int size) {
        List<Figure> list = new ArrayList<Figure>();
        for (int i = 0; i < size; i++)
            list.add(new Figure(Type.CYRCLE, Colour.BLACK));
        return list;
    }

    public String toString() {
        return "Color: " + this.color + " / Type: " + type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        Figure other = (Figure) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (color != other.color)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (type != other.type)
            return false;
        return true;
    }

}
