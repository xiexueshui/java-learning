/**
 * @auther xxs
 * @date 2021-04-09
 */
public class StaticInnerMode {
    // 静态内部类实现单例模式
    // 1、静态内部类在外部类加载时不会加载 - 解决了内部浪费的问题
    // 2、 getInstance 时实现类加载时是线程安全的

    private StaticInnerMode(){

    }

    static class StaticInnerModeInstance{
        private final static StaticInnerMode instance = new StaticInnerMode();
    }

    public StaticInnerMode getInstance(){
        return StaticInnerModeInstance.instance;
    }

}
