import java.lang.annotation.Annotation;

public class interfaceTest {

    public static void main(String[] args) {

        Class<Student> cl = Student.class;
        Annotation[] annotations = cl.getAnnotations();
         say say = (say) cl.getAnnotation(say.class);
        System.out.println(say.value());
        System.out.println(say.isDelete());


        info info = (info) cl.getAnnotation(info.class);
        System.out.println(info.value());



    }

    @say()
    @info("ss")

    public  class Student{
        private String name;

        public Student(String name) {
            this.name = name;
        }

    }

}
