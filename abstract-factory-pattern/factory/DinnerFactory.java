package factory;

import rice.Rice;
import rice.RicePorridge;
import tableware.Spoon;
import tableware.Tableware;

/**
 * @author ChenVF
 * date 2020-01-12
 * 晚餐工厂
 */
public class DinnerFactory extends Factory {
    @Override
    public Rice getRice() {
        return new RicePorridge();
    }

    @Override
    public Tableware getTableware() {
        return new Spoon();
    }
}
