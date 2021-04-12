package designmodel.action;

import java.util.ArrayList;
import java.util.List;

public class IterMode {

    public static interface Iter<T>{

        public boolean hasNext();

        public T next();
    }

    public static class ListHolder{
        private List<Integer> internelList = new ArrayList<>();

        public class ListIter implements Iter<Integer>{
            int index = -1;

            @Override
            public boolean hasNext() {
                return index < internelList.size();
            }

            @Override
            public Integer next() {
                return internelList.get(++index);
            }
        }
    }
}
