import java.util.concurrent.Callable;

public class XLamda implements Callable<String> {
    @Override
    public String call()  {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
        return "ok";
    }


    public static void main(String[] args) {

        // 局部内部类
        class ARunnable implements Runnable {

            @Override
            public void run() {
                System.out.println("局部内部类");
            }
        }
        ARunnable a = new ARunnable();
        new Thread(a).start();

        // 匿名内部类
        Runnable b = new Runnable() {

            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        };
        new Thread(b).start();

        //Lamda
        new Thread(() -> System.out.println("Lamda表达式")).start();

        // 通过匿名内部类实例化接口 相当于 新建了一个class 实现了person接口 这里的p就是这个内部类类型
        person p = new person() {
            @Override
            public void eat(String food) {
                System.out.println(food);
            }
        };
        p.eat("noodles");

        //lamda表达式简化
        person p2 = (String c) -> {
            System.out.println("1 -- i like " + c);
        };
        p2.eat("noodles");

        //去掉参数类型
        person p3 = (c) -> {
            System.out.println("2 -- i like " + c);
        };
        p3.eat("noodles");

        //去点{}
        person p4 = (c) ->System.out.println("3 -- i like " + c);
        p4.eat("noodles");
    }

    interface person {
        void eat(String food);
    }


}
