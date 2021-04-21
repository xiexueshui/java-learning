import java.lang.annotation.*;

/**
 * @author 76803
 */
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

@Documented
public @interface say {
    String value() default "tracy";
    boolean isDelete() default false;
}
