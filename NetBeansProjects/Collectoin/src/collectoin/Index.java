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

        return !(value == null ? other.value != null : !value.equals(other.value));

    }

    @Override
    public int compareTo(Index other) {
        try {
            if (index == other.index && value.compareTo(other.value) == 0) {
                return 0;
            }
            if (index > other.index || index == other.index && value.compareTo(other.value) > 0) {
                return 1;
            }
            if (index < other.index || index == other.index && value.compareTo(other.value) < 0) {
                return -1;
            }

        } catch (NullPointerException e) {
        }
        return 0;

    }
}
