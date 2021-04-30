public class XingHaoDeng {
    public static void main(String[] args) {
        Tv tv = new Tv();
        new Player(tv).start();
        new Watcher(tv).start();
    }


}

class Player extends Thread {
    Tv tv;

    public Player(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        try {
            Boolean flag = true;
            while (true){
                if (flag) {
                    this.tv.paly("小品");
                    flag = !flag;
                }
                {
                    this.tv.paly("相声");
                    flag = !flag;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Watcher extends Thread {
    Tv tv;

    public Watcher(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        try {
            while (true){
                this.tv.watch();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Tv {
    Boolean flag = true;
    String name;

    public synchronized void watch() throws InterruptedException {
        if (!flag) {
            wait();
        }
        {
            Thread.sleep(1000);
            System.out.println("演员表演了" + this.name);
            this.flag = !flag;
            notifyAll();
        }
    }

    public synchronized void paly(String name) throws InterruptedException {
        this.name = name;
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        {
            System.out.println("观众观看了" + name);
            this.flag = !flag;
            notifyAll();
        }
    }
}
