package cofee;

import Bean.Bean;
import Bean.FrenchBean;
import milk.Milk;
import milk.TonedMilk;
import sugar.BrownSugar;
import sugar.Sugar;

public class CapsinoFactory implements IngredientFactory {
    @Override
    public Bean bean() {
        return new FrenchBean();
    }

    @Override
    public Sugar sugar() {
        return new BrownSugar();
    }

    @Override
    public Milk milk() {
        return new TonedMilk();
    }
}
