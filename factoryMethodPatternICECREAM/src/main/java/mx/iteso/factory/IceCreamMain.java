package mx.iteso.factory;

import mx.iteso.factory.stores.IceCreamStoreOne;

public class IceCreamMain {
    public static void main (String[] args) {
        IceCreamStore storeOne = new IceCreamStoreOne();

        ConeIceCream coneIceCream = storeOne.orderIceCream("strawberry","water");
        System.out.println("La primera orden es un: "+ coneIceCream.getName());
        System.out.println();

        ConeIceCream coneIceCream2 = storeOne.orderIceCream("mango","milk");
        System.out.println("La primera orden es un: "+ coneIceCream2.getName());
        System.out.println();
    }
}