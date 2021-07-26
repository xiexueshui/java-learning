/**
 * @auther xxs
 * @date 2021-05-21
 */
public class text1{

    public static void main(String[] args) {
        /**
         * a的引用地址，是常量池的物理地址
         */
        String a = "1";
        System.out.println(System.identityHashCode(a));
        /**
         * 改变a的值，引用也会改变
         */
        a = "2";
        System.out.println(System.identityHashCode(a));
        /**
         *  a和b的引用是一样的，所以 a==b 为true ,因为他们都是指向常量池中“1”
         */
        String b = "1";
        System.out.println(System.identityHashCode(b));
        /**
         * new 出来的存放的是堆中的地址，所以 c==d 为false ；
         * 这时创建流程：首先从常量池找"1",有就不创建；然后在堆内存创建“1”的内存空间；栈内存里的引用指向堆内存的“1”而不是常量池的“1”
         */
        String c = new String("1");
        String d = new String("1");
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        /**
         * 重新赋值，又指向常量池的“1”
         */
        c = "1";
        System.out.println(System.identityHashCode(c));



    }
}
