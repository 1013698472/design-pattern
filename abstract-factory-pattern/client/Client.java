package client;

import factory.Factory;
import factory.LunchFactory;
import rice.Rice;
import tableware.Tableware;

/**
 * @author ChenVF
 * date 2020-01-12
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new LunchFactory();//创建一个午餐工厂

        //创建一系列产品
        Tableware tableware = factory.getTableware();
        Rice rice = factory.getRice();
    }
}
