package designmodel.action;

import java.util.ArrayList;
import java.util.List;

public class SubjectMode {

    public class Event{

    }
    interface Observer{

        public void subjectChanged(Event event);

    }

    public static class Subject{

        private List<Observer> observerList = new ArrayList<Observer>();

        public void subject(Observer observer){
            observerList.add(observer);
        }

        public void notify(Event event){
            for (Observer observer : observerList) {
                observer.subjectChanged(event);
            }
        }
    }
}
