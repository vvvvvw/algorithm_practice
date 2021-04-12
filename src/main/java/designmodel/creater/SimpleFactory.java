package designmodel.creater;

public class SimpleFactory {

    public interface Color{

    }

    public static class Red implements Color{

    }

    public static class Blue implements Color{

    }

    private static Color getColor(String color){
        if("red".equals(color)){
            return new Red();
        }else if("blue".equals(color)){
            return new Blue();
        }
        throw new IllegalArgumentException();
    }
}

