/**
 * @auther xxs
 * @date 2021-04-09
 */
public class LazyMode {
    // 懒汉模式  - 效率低

    private LazyMode(){}

    private static  LazyMode instance;

    public synchronized LazyMode getInstance(){
        if(instance == null){
            // 当有多个线程一起进入到这里会创建多个实例 - 线程不安全  通过加入synchronized保证线程同步
            instance = new LazyMode();
        }
        return instance;
    }
}
