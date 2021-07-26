/**
 * @auther xxs
 * @date 2021-05-20
 */
public class absImpl2 extends absImpl{
    private String age;

    public static void main(String[] args) {

        /**
         * 父类引用指向子类 向上转型
         */
        absImpl absImpl2 = new absImpl2();

        /**
         * 实现类向下转型成接口
         */
        abs abs = new absImpl();

        /**
         * 子类引用指向父类 向下转型
         * 报错 java.lang.ClassCastException: absImpl cannot be cast to absImpl2
         * absImpl2 abs = (absImpl2) new absImpl();
         *
         * absImpl2 ab2 =(absImpl2) absImpl2;
         * 可以实现向下转型 ；这里把absImpl2的引用赋值给ab2，absImpls引用指向的是new absImpl2()
         */
        absImpl2 ab2 =(absImpl2) absImpl2;

    }
}
