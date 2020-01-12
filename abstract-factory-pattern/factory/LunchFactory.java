package factory;

import rice.FriedRice;
import rice.Rice;
import tableware.Chopsticks;
import tableware.Tableware;

/**
 * @author ChenVF
 * date 2020-01-12
 * 午餐工厂
 */
public class LunchFactory extends Factory {

    @Override
    public Rice getRice() {
        return new FriedRice();
    }

    @Override
    public Tableware getTableware() {
        return new Chopsticks();
    }
}
