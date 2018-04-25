import java.util.Collection;
import java.util.Iterator;

public interface OrderedInts extends Comparable<OrderedInts>, Collection<Integer> {

    @Override
    default int compareTo(OrderedInts orderedInts) {

        if(this.size() < orderedInts.size())
            return -1;
        if(this.size() > orderedInts.size())
            return 1;

        for(Iterator<Integer> iterator = this.iterator(); iterator.hasNext(); ){
            for(Iterator<Integer> iteratorOther = orderedInts.iterator(); iteratorOther.hasNext(); ){
                final Integer fst =  iterator.next();
                final Integer snd = iteratorOther.next();
                if(fst == snd)
                    continue;
                if(fst < snd)
                    return -1;
                if(fst > snd)
                    return 1;
            }

        }

        return 0;
    }


}
