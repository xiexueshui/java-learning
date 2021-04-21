public class XThread  extends Thread{

    @Override
    public void run(){
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
        XThread xThread = new XThread();
        XThread xThread2 = new XThread();
        XThread xThread3 = new XThread();
        xThread.setName("x1");
        xThread2.setName("x2");
        xThread3.setName("x3");
        xThread.start();
        xThread2.start();
        xThread3.start();
    }
}
