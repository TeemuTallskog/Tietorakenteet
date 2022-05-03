package TrafficCards;

import java.util.Comparator;

public class TrafficCardTravellerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(((TrafficCard)o1).mTravellerNumber, ((TrafficCard)o2).mTravellerNumber);
    }
}
