public class ExcptionText {
    public static void main(String[] args) {

        try {
            text01();
            text02();
            text03();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void text01()
    {
        try {
           int i=1/0;
        } catch (Exception e) {
            System.out.println("异常1");
          //  throw e;
        }
    }
    public static void text02()
    {
        try {
            int i=1/0;
        } catch (Exception e) {
            System.out.println("异常2");
            throw e;
        }
    }
    public static void text03()
    {
        try {
            int i=1/0;
        } catch (Exception e) {
            System.out.println("异常3");
            throw e;
        }
    }
}

