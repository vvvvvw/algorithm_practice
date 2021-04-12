package designmodel.structure;

public class BridgeMode {

    public interface Sharp{
        public void setColor(Color color);
        public void getColor();
        public void draw();

    }

    public interface Color{
        public void fill();
    }


    public static class Red implements Color {

        @Override
        public void fill() {

        }
    }


    public static class Blue implements Color {

        @Override
        public void fill() {

        }
    }


    public static class Circle implements Sharp {
        Color color = null;

        @Override
        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public void getColor() {

        }

        @Override
        public void draw() {

        }
    }

    public static class Square implements Sharp {
        Color color = null;

        @Override
        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public void getColor() {

        }

        @Override
        public void draw() {

        }
    }


    public static void main(String[] args) {
        Sharp sharp = new Circle();

        sharp.setColor(new Red());
        sharp.draw();


    }



}
