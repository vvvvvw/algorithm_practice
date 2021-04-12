package designmodel.creater;

public class BuilderMode {

    public interface Sharp{
        public void setColor(Color color);
        public void getColor();
        public void draw();

    }

    public interface Color{
        public void fill();
    }
    public static class Circle implements Sharp{
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

    public static class Square implements Sharp{
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


    public static class Builder {

        public Sharp draw(Sharp sharp,Color color) {
            sharp.setColor(color);
            return sharp;
        }
    }
}
