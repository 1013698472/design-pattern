package builder;

import builder.FruitBuilder;
import fruit.Fruit;

/**
 * @author ChenVF
 * date 2020-01-20
 * 水果-苹果
 */
public class AppleBuilder implements FruitBuilder {
    Fruit fruit;
    public AppleBuilder() {
        fruit = new Fruit();
    }
    @Override
    public void selectFruit() {
        System.out.println("挑选苹果中...");
        fruit.setType("苹果");
    }

    @Override
    public void cleanFruit() {
        System.out.println("清洗苹果中...");
        fruit.setState(true);
    }

    @Override
    public void packFruit() {
        System.out.println("打包苹果中...");
        fruit.setPack(true);
    }

    @Override
    public Fruit returnFruit() {
        return fruit;
    }
}
