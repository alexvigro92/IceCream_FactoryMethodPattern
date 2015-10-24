package mx.iteso.factory.stores;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.icecreams.*;

public class IceCreamStoreOne extends IceCreamStore {

    @Override
    protected ConeIceCream createIceCream(String flavour , String base) {
            if(base.equals("water"))
               return RefrigeradorBaseAgua(flavour);
            else if(base.equals("milk"))
                return RefrigeradorBaseLeche(flavour);
            else
                return null;
    }

    public ConeIceCream RefrigeradorBaseLeche(String flavour){
        if (flavour.equals("strawberry"))
            return new IceCreamStrawberryMilk();
        else if (flavour.equals("pineapple") )
            return new IceCreamPineappleMilk();
        else if (flavour.equals("mango") )
            return new IceCreamMangoMilk();
        else if (flavour.equals("guava") )
            return new IceCreamGuavaMilk();
        else return null;

    }

    public ConeIceCream RefrigeradorBaseAgua(String flavour){
        if (flavour.equals("strawberry"))
            return new IceCreamStrawberryWater();
        else if (flavour.equals("pineapple") )
            return new IceCreamPineappleWater();
        else if (flavour.equals("mango") )
            return new IceCreamMangoWater();
        else if (flavour.equals("guava") )
            return new IceCreamGuavaWater();
        else return null;

    }
}
