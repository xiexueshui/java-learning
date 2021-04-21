/**
 * @auther xxs
 * @date 2021-04-09
 */
public class DoubleCheck {
    // 双重检查模式 -解决了饿汉模式浪费内存 和 懒汉模式效率低的问题
    private DoubleCheck(){}

    private  volatile  static DoubleCheck instance;

    public DoubleCheck getInstance(){
        if(instance == null){
            synchronized (DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
