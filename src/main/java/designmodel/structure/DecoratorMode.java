package designmodel.structure;

public class DecoratorMode {

    public interface Sharp{
        public void draw();

    }

    public static class Circle implements Sharp {

        @Override
        public void draw() {

        }
    }

    public interface Color{
        public void fill();
    }

    public static class Red implements Color {

        @Override
        public void fill() {

        }
    }


    public static class CircleDecorator implements Sharp{
        Color color = new Red();
        Circle circle = new Circle();
       @Override
       public void draw() {
           color.fill();
           circle.draw();
       }
   }
}
