package annotation.stringinjector;

import java.lang.reflect.Field;

/**
 * Created by Forrest on 2016. 12. 2..
 */
public class MyContextContainer {
    public MyContextContainer() {
    }

    private <T> T invokeAnnotations(T instance) throws IllegalAccessException {
        Field[] fields = instance.getClass().getDeclaredFields();
        for (Field field : fields) {
            StringInjector annotation = field.getAnnotation(StringInjector.class);
            System.out.println("field :: " + field);
            System.out.println("annotation :: " + annotation);
            if (annotation != null && field.getType() == String.class) {
                field.setAccessible(true);
                field.set(instance, annotation.value());
                System.out.println("field :: " + field);
            }
        }
        return instance;
    }

    public <T> T get(Class clazz)throws IllegalAccessException, InstantiationException {
        T instance = (T) clazz.newInstance();
        instance = invokeAnnotations(instance);
        return instance;
    }
}
