package client;

import factory.Factory;
import product.Product;

/**
 * @author ChenVF
 * date 2019-12-28
 */
public class Client {

    public static void main(String[] args) {
        Product product;
        //这种方式不利于客户端的使用,修改类型需要更改客户端代码(违反开闭原则)
        //可以通过配置文件获取相应类型,这样客户端只需要修改配置文件,而不用修改代码
        String type = "A";
        //客户端调用工厂方法生成产品
        product = Factory.greatProduct(type);
        product.methdDiff();    // 调用公共业务方法
        product.methdSame();    // 调用不同产品自己实现的方法
    }
}
