public class Obliczenia /*extends Thread*/implements Runnable{ // Thread to po ang. nitka
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(i + ". ID:" + Thread.currentThread().getId());//+ to kontagenacja
        }
    }
}
