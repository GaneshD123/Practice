import java.util.HashSet;

public class DemoBlockedRunnable implements Runnable{

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        commonResource();

    }
public static synchronized void commonResource(){
        while (true){
            System.out.println("In the while loop");

        }
}

}
