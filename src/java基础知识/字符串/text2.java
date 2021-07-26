/**
 * @auther xxs
 * @date 2021-05-21
 */
public class text2 {
    public static void main(String[] args) {
        /**
         *
         */
        ctext a = new ctext("1");
        System.out.println(System.identityHashCode(a));
        ctext b = a;
        System.out.println(System.identityHashCode(b));
        ctext c = new ctext("1");
        System.out.println(System.identityHashCode(c));

        /**
         *  此时 a和b指向同一个地址所以 a,b值相等
         */
        a.setName("3");
        System.out.println(a.getName());
        System.out.println(b.getName());

        /**
         * a=c 或者 a = new ctext() 都会让a重新指向一个地址，所以a改变d不变
         * new 会在堆内存开辟一段新的内存空间
         */
        ctext d = a;
        a = new ctext();
        a.setName("4");
        System.out.println(a.getName());
        System.out.println(d.getName());
        System.out.println(System.identityHashCode(a));




    }


}
