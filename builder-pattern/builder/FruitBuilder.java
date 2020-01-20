package builder;

import fruit.Fruit;

/**
 * @author ChenVF
 * date 2020-01-20
 * 水果建造者接口
 */
public interface FruitBuilder {
    // 挑选
    void selectFruit();
    // 清洗
    void cleanFruit();
    // 打包
    void packFruit();

    Fruit returnFruit();
}
