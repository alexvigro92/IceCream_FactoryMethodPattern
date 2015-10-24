package mx.iteso.factory;

public abstract class IceCreamStore {

    public ConeIceCream orderIceCream(String flavour,String base){
        ConeIceCream coneIceCream;

        coneIceCream = createIceCream(flavour,base);

        coneIceCream.prepare();
        coneIceCream.serve();

        return coneIceCream;
    }

    protected abstract ConeIceCream createIceCream(String flavour,String base);
}