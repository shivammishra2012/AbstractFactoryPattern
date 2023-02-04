package cofee;

import Bean.Bean;
import milk.Milk;
import sugar.Sugar;

public interface IngredientFactory {


    public Bean bean();
    public Sugar sugar();
    public Milk milk();
}
