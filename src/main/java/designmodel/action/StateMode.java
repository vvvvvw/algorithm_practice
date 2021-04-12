package designmodel.action;

public class StateMode {

    public static class Context{
        public final static InitState initState = new InitState();
        public final static StartingState startingState = new StartingState();
        public final static ShutdownState shutdownState = new ShutdownState();

        private State state;

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public void init(){
            this.state = initState;
        }

        public void start(){
            this.state.start(this);
        }


        public void shutdown(){
            this.state.shutdown(this);
        }
    }


    public static interface State{

        public void init(Context context);

        public void start(Context context);

        public void shutdown(Context context);

    }

    public static abstract class AbstractState implements State{
        Context context;

        public Context getContext() {
            return context;
        }

        public void setContext(Context context) {
            this.context = context;
        }
    }

    public static class InitState implements State{

        @Override
        public void init(Context context) {
        }

        @Override
        public void start(Context context) {
            System.out.printf("start");
            context.setState(Context.startingState);
        }

        @Override
        public void shutdown(Context context) {

        }
    }

    public static class StartingState implements State{

        @Override
        public void init(Context context) {

        }

        @Override
        public void start(Context context) {

        }

        @Override
        public void shutdown(Context context) {
            System.out.printf("shutdown");
            context.setState(Context.shutdownState);
        }
    }


    public static class ShutdownState implements State{

        @Override
        public void init(Context context) {

        }

        @Override
        public void start(Context context) {

        }

        @Override
        public void shutdown(Context context) {
        }
    }


    public static void main(String[] args) {
        Context context = new Context();
    }
}
