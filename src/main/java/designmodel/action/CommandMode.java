package designmodel.action;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CommandMode {

    public interface Receiver {
        public void action(Command command);
    }

    public class ConcretReceiver implements Receiver{
        public void action(Command command){
            System.out.printf("cmd receiver"+command);
        }
    }

    public interface Command{
        public void execute(Receiver receiver);
    }

    public class ConcretCommand implements Command{

        @Override
        public void execute(Receiver receiver) {
            receiver.action(this);
        }
    }

    public class Invoker{

        Receiver receiver = new ConcretReceiver();
        public void executeCmd(Command command){
            receiver.action(command);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
        final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readLock.lock();
                System.out.printf("read lock ");
            }
        }).start();

        Thread.sleep(1000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                System.out.printf("write lock ");
            }
        }).start();

        Thread.sleep(1000);

        new Thread(new Runnable() {
        @Override
        public void run() {
            readLock.lock();
            System.out.printf("read lock 2");
        }
    }).start();
}

}
