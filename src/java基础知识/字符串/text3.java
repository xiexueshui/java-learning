/**
 * @auther xxs
 * @date 2021-05-24
 */
public class text3 {
    public static void main(String[] args) {
        String a = "1";
        System.out.println(System.identityHashCode(a));
        a += "2";
        System.out.println(System.identityHashCode(a));
        /**
         * 此中会进行的
         * StringBuffer s = new StringBuffer()
         * s.append("1")
         * s.append("2")
         */

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

    }
}
