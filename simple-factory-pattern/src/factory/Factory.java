package factory;

import product.Product;
import product.ProductA;
import product.ProductB;

/**
 * @author ChenVF
 * date 2019-12-28
 * 工厂类
 */
public class Factory {

    /**
     * 静态工厂方法
     * 根据传入的参数返回相应的对象
     * @param type 类型
     * @return
     */
    static public Product greatProduct(String type){
        Product product = null;
        if (type.equals("A")){
            product = new ProductA();
        }else if (type.equals("B")){
            product = new ProductB();
        }
        return product;
    }
}
