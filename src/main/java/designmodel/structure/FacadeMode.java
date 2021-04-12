package designmodel.structure;

public class FacadeMode {

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


   public static class SharpFacade{
        Circle circle = new Circle();
        Color color = new Red();

        public void drawRedCircle(){
            color.fill();
            circle.draw();
        }
   }

}
