import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedMethods {
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public  void calculate() {
        setSum(getSum() + 1);
        System.out.println("name="+Thread.currentThread().getName());
        System.out.println("sum="+sum);
    }

    public static void main(String[] args) throws Exception{
        SynchronizedMethods summation = new SynchronizedMethods();
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        IntStream.range(0,1000).forEach(count->executorService.submit(summation::calculate));
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
    }
}
