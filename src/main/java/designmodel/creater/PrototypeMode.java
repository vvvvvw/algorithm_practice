package designmodel.creater;

public class PrototypeMode {

    public class ToCopy implements Cloneable{

        public class Sharp{
            public String color;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            protected Sharp clone() throws CloneNotSupportedException {
                Sharp sharp = new Sharp();
                sharp.setColor(this.color);
                return sharp;
            }
        }
    }
}
