package client;

import factory.ConcreteFactoryA;
import factory.Factory;
import product.Product;

/**
 * @author ChenVF
 * date 2020-01-04
 */
public class client {
    public static void main(String[] args) {
        Factory factory;
        factory = new ConcreteFactoryA();   //根据需求调整
//        factory = new ConcreteFactoryB();
        Product product;
        product = factory.factoryMethod();
    }
}
