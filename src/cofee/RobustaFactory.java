package cofee;

import Bean.Bean;
import milk.Milk;
import sugar.Sugar;

public class RobustaFactory implements IngredientFactory{
    @Override
    public Bean bean() {
        return null;
    }

    @Override
    public Sugar sugar() {
        return null;
    }

    @Override
    public Milk milk() {
        return null;
    }
}
