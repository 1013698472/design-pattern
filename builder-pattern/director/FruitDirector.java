package director;

import builder.FruitBuilder;
import fruit.Fruit;

/**
 * @author ChenVF
 * date 2020-01-20
 * 指挥者
 */
public class FruitDirector {
    public Fruit creatFruit(FruitBuilder fruitBuilder){
        fruitBuilder.selectFruit();
        fruitBuilder.cleanFruit();
        fruitBuilder.packFruit();
        return fruitBuilder.returnFruit();
    }
}
