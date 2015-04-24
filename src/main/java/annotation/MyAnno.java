package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2015-04-17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String greeting() default "Hello, ";

    String name() default "Forrest";

    int age() default 35;
}
