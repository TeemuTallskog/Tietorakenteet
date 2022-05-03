package TrafficCards;

import java.util.Comparator;

public class TrafficCardBalanceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Float.compare(((TrafficCard) o1).mBalance,((TrafficCard) o2).mBalance );
    }
}
