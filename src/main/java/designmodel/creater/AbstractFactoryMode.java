package designmodel.creater;

public class AbstractFactoryMode {


    public static interface Circle{
        public void draw();

    }

/*
    class RedCircle implements Circle{

        @Override
        public void draw() {

        }
    }

    class BlueCircle implements Circle{

        public void draw() {

        }
    }
*/

    public interface Square{
        public void draw();

    }

    public static class RedSquare implements Square{

        public void draw() {

        }
    }

    public static class BlueSquare implements Square{

        public void draw() {

        }
    }

    public interface SharpFactory{
        Circle createCircle();
        Square createSquare();
    }

    public static class RedShapeFactory implements SharpFactory{

        @Override
        public Circle createCircle() {
            return null;/*new RedCircle();*/
        }

        @Override
        public Square createSquare() {
            return new RedSquare();
        }
    }

    public static class BlueShapeFactory implements SharpFactory{

        @Override
        public Circle createCircle() {
            return null;/*new BlueCircle();*/
        }

        @Override
        public Square createSquare() {
            return new BlueSquare();
        }
    }

    public static class FactoryProducer {
        public static SharpFactory getFactory(String choice){
            if(choice.equalsIgnoreCase("red")){
                return new RedShapeFactory();
            } else if(choice.equalsIgnoreCase("COLOR")){
                return new BlueShapeFactory();
            }
            return null;
        }
    }

}
