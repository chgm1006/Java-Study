package pattern.factoryMethodPattern;

/**
 * Created by Forrest on 2016. 11. 18..
 */
public class Cat extends Animal {
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
