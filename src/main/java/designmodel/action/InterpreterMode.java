package designmodel.action;

public class InterpreterMode {

    public static class Context {
        public int opNum1 = -1;

        public int opNum2 = -1;

        public Context(int opNum1, int opNum2) {
            this.opNum1 = opNum1;
            this.opNum2 = opNum2;
        }

        public int getOpNum1() {
            return opNum1;
        }

        public int getOpNum2() {
            return opNum2;
        }


    }

    public interface Interpreter{

        public int interpret(Context context);
    }

    public static class AddOp implements Interpreter{

        @Override
        public int interpret(Context context) {
            return context.opNum1 + context.opNum2;
        }
    }

    public static class SubOp implements Interpreter{

        @Override
        public int interpret(Context context) {
            return context.opNum1 - context.opNum2;
        }
    }


    public static void main(String[] args) {
        int res = new SubOp().interpret(new Context(new AddOp().interpret(new Context(1,2)),2));

    }
}
