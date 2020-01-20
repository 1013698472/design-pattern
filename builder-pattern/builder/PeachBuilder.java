package builder;

import builder.FruitBuilder;
import fruit.Fruit;

/**
 * @author ChenVF
 * date 2020-01-20
 * 水果-桃子
 */
public class PeachBuilder implements FruitBuilder {
    Fruit fruit;
    public PeachBuilder(){
        fruit = new Fruit();
    }
    @Override
    public void selectFruit() {
        System.out.println("挑选桃子中...");
        fruit.setType("桃子");
    }

    @Override
    public void cleanFruit() {
        System.out.println("清洗桃子中...");
        fruit.setState(true);
    }

    @Override
    public void packFruit() {
        System.out.println("打包桃子中...");
        fruit.setPack(true);
    }

    @Override
    public Fruit returnFruit() {
        return fruit;
    }
}
