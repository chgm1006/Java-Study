package annotation.stringinjector;

/**
 * Created by Forrest on 2016. 12. 2..
 */
public class MyObject {
    @StringInjector("My name is Forrest.")
    private String name;

    @StringInjector
    private String defaultValue;

    @StringInjector
    private Integer invalidType;

    public String getName() {
        return name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public Integer getInvalidType() {
        return invalidType;
    }
}
