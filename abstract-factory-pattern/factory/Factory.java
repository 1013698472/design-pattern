package factory;


import rice.Rice;
import tableware.Tableware;

/**
 * @author ChenVF
 * date 2020-01-12
 *抽象工厂
 */
public abstract class Factory {

    public abstract Rice getRice();
    public abstract Tableware getTableware();

}
