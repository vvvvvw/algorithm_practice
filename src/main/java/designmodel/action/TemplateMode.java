package designmodel.action;

public class TemplateMode {

    public abstract class Game{

        public final void play(){
            startGame();
            endGame();
        }

        protected abstract void endGame();

        protected abstract void startGame();
    }

    public class Football extends Game{

        @Override
        protected void endGame() {
            System.out.printf("end football");
        }

        @Override
        protected void startGame() {
            System.out.printf("play football");
        }
    }

    public class Basketball extends Game{

        @Override
        protected void endGame() {
            System.out.printf("end basketball");
        }

        @Override
        protected void startGame() {
            System.out.printf("play basketball");
        }
    }

}
