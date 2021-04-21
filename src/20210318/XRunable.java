public class XRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

    public static void main(String[] args) {
        new Thread(new XRunable(),"x1 -- ").start();
        new Thread(new XRunable(),"x2 -- ").start();

    }
}
