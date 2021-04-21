public class XStopThread implements Runnable
{

    private Boolean flag = true;
    @Override
    public void run() {
        while (flag){
            System.out.println("线程进行ing");
        }
    }

    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        XStopThread xStopThread =  new XStopThread();
        new Thread(xStopThread).start();

        Thread.currentThread().sleep(1000);
                xStopThread.stop();


    }
}
