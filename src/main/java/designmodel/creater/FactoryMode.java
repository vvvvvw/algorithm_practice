package designmodel.creater;

public class FactoryMode {

    public interface Color{

    }

    public interface ColorFactory{

        public Color createColor();
    }

    public static class Red implements Color {

    }

    public static class RedColorFactory implements ColorFactory{

        @Override
        public Color createColor() {
            return new Red();
        }
    }

    public static class Blue implements Color {

    }

    public static class BlueColorFactory implements ColorFactory{

        @Override
        public Color createColor() {
            return new Blue();
        }
    }


    public static void main(String[] args) {
        Color color = new RedColorFactory().createColor();
    }

}
