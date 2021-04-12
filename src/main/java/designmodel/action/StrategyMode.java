package designmodel.action;

public class StrategyMode {

    public static interface Strategy{
        int compute(int num1,int num2);
    }

    public static class OpAdd implements Strategy{

        @Override
        public int compute(int num1, int num2) {
            return num1+num2;
        }
    }

    public static class OpSub implements Strategy{

        @Override
        public int compute(int num1, int num2) {
            return num1-num2;
        }
    }

    public static class Context{
        private Strategy strategy;

        public Context(Strategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
        }

        public int execute(int num1,int num2) {
            return strategy.compute(num1,num2);
        }
    }

    public static void main(String[] args) {
        Context context = new Context(new OpAdd());
        context.execute(1,2);

        context.setStrategy(new OpSub());
        context.execute(1,2);
    }
}
