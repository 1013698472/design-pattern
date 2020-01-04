package factory;

import product.ConcreteProductA;
import product.Product;

/**
 * @author ChenVF
 * date 2020-01-04
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
