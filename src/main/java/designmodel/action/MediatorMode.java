package designmodel.action;

public class MediatorMode {

    public static class Person{
        private Integer num = -1;

        public Person(Integer num) {
            this.num = num;
        }

        public void say(){
            System.out.printf("persion "+ num + " say");
        }
    }

    public static class ChatRoom{

        Person person1 = new Person(1);
        Person person2 = new Person(2);

        public void chat(){
            person1.say();
            person2.say();
        }

    }
}
