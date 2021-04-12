package designmodel.creater;

public class SingleMode {

    public static class SingleInstance{
        public static final SingleInstance instance = new SingleInstance();
    }

    public static SingleInstance getInstance(){
        return SingleInstance.instance;
    }
}
