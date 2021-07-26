/**
 * @auther xxs
 * @date 2021-05-19
 */
public abstract class abs {
    public String name;
    public String code;

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 抽象类可以有构造函数，接口没有
     */
    public abs() {
        System.out.println("this is abs");
    }

    /**
     * 抽象类可以有非抽象的方法，接口的方法都是抽象的
     */
     void show(){
        System.out.println("show");
    }

    void eat(){
        System.out.println("eat");
    };

}
