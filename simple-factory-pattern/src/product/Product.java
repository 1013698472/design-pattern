package product;

/**
 * @author ChenVF
 * date 2019-12-28
 */
public abstract class Product {
    //所有产品的公共业务方法
    public void methdSame(){
        System.out.println("我是一种产品");
    }
    //抽象的业务方法:子类自己实现
    public abstract void methdDiff();
}
