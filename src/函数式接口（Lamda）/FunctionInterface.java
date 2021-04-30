import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @auther xxs
 * @date 2021-03-26
 */
public class FunctionInterface {
    public static void main(String[] args) {
        // 回归一下lamda表达式
        //局部内部类
        class aFunction implements Function<String,String>{
            @Override
            public String apply(String S) {
                return S;
            }
        }
        Function<String, String> function3 = new aFunction();

        // 匿名内部类
        Function<String, String> function2 = new Function<String, String>() {
            @Override
            public String apply(String a) {
                return a;
            }
        };
        //Lamda表达式
        Function<String, String> function1 = ((a) -> {
            return a;
        });
        // lamda 简化
        // 1、函数式接口 Function
        Function<String, String> function = ((a) -> a);

        //2、断定式接口 Predicate
        Predicate<String> predicate = ((a)-> true);

        // 3、消费式接口
        Consumer<String> consumer = ((a)->{});

        // 4、供给式接口
        Supplier<String> supplier =(()-> "hello");

        System.out.println(function.apply("hello function"));
        System.out.println( predicate.test(""));
        consumer.accept("");
        System.out.println(supplier.get());



    }
}
