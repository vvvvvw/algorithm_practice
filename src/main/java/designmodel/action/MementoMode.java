package designmodel.action;

import java.util.ArrayList;
import java.util.List;

public class MementoMode {

    public static class Memento{

        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public static class MementoManager{

        private static List<Memento> mementoList = new ArrayList<>();

        public static boolean addMemento(Memento memento){
            return mementoList.add(memento);
        }

        public static Memento getMemento(int index){
            return mementoList.get(index);
        }
    }

    public static class Original{

        private String state;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void saveState(){
            MementoManager.addMemento(new Memento(state));
        }

        public void restore(Memento memento){
            this.state = memento.state;
        }
    }

    public static void main(String[] args) {
        Original original = new Original();
        original.setState("aaa");
        original.saveState();

        original.setState("bbb");
        original.saveState();

        Memento memento = MementoManager.getMemento(0);
        original.restore(memento);
    }
}
