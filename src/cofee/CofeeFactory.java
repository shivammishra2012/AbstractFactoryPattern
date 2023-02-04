package cofee;

import Bean.AmericanBean;
import Bean.FrenchBean;
import cofee.Capisino;
import cofee.Cofee;
import cofee.Robusta;
import milk.TonedMilk;
import sugar.BrownSugar;

public class CofeeFactory {



    private final IngredientFactory ingredientFactory;

    public CofeeFactory(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    // Intially coffe is dependent on three abstarct class which is avoiding dependency inversion principle

    /* public Cofee getCofee(String type)
        {
            Cofee cofee;
            if(type.equals("capsichnio"))
            {
                cofee=new Capisino(new BrownSugar(),new TonedMilk(),new AmericanBean());
            }
            else {
                cofee = new Robusta(new BrownSugar(),new TonedMilk(),new FrenchBean());
            }
            return cofee;
        }*/
    public Cofee getCofee(String type)
    {
        Cofee cofee;

        if(type.equals("capsichnio"))
        {
            cofee=new Capisino(new CapsinoFactory());
        }
        else {
            cofee = new Robusta(new RobustaFactory());
        }
        return cofee;
    }

}
