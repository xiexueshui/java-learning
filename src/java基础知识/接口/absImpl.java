/**
 * @auther xxs
 * @date 2021-05-19
 */
public class absImpl extends abs{

    @Override
    public void show(){
        System.out.println("absImpl");
    }


    public static void main(String[] args) {
        absImpl abs = new absImpl();
        abs.show();
        abs.eat();
        abs.setName("ccc");
        System.out.println(abs.name);
    }
}
