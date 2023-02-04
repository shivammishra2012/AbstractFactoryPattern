package cofee;

import Bean.Bean;
import milk.Milk;
import sugar.Sugar;

public abstract class Cofee
{
    private final Sugar sugar;
    private final Milk milk;
    private final Bean bean;


    public Cofee(IngredientFactory ingredientFactory) {

        this.sugar= ingredientFactory.sugar();
        this.milk = ingredientFactory.milk();
        this.bean = ingredientFactory.bean();
    }


   abstract void brew();
   abstract void boil();


}
