package collectoin;

/**
 *
 * @author Александр
 */
public class Index implements Comparable<Index> {

    private final int index;
    private final String value;

    public Index(int index, String value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        return "#" + index + " " + value;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + index;
        if (value != null) {
            result = prime * result + value.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Index other = (Index) obj;
        if (index != other.index) {
            return false;
        }
        if (value.equals(other.value)==false) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Index other) {
        if (value != null && other.value != null) {
            if (index == other.index && value.compareTo(other.value) == 0) {
                return 0;
            }
            if (index == other.index && value.compareTo(other.value) > 0) {
                return 1;
            }
            if (index == other.index && value.compareTo(other.value) < 0) {
                return -1;
            }
        }
        return (index < other.index) ? -1 : 1;
    }
}
