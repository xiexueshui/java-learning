/**
 * @auther xxs
 * @date 2021-04-15
 */
public enum  EnumMode {

    // 枚举实现单例 ，可以防止反射破坏单例

    INSTANCE;
    public static void main(String[] args) {
        EnumMode instance = EnumMode.INSTANCE;
        EnumMode instance2 = EnumMode.INSTANCE;
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

}

