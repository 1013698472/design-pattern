package client;

import builder.AppleBuilder;
import builder.FruitBuilder;
import com.sun.org.apache.bcel.internal.generic.NEW;
import director.FruitDirector;
import fruit.Fruit;

/**
 * @author ChenVF
 * date 2020-01-20
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        FruitDirector fruitDirector = new FruitDirector();      // 挑选老板
        FruitBuilder fruitBuilder =new AppleBuilder();          // 挑选类型:苹果
        Fruit fruit = fruitDirector.creatFruit(fruitBuilder);   // 得到水果
        System.out.println(fruit.toString());
    }
}
