package mx.iteso.factory.storesTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.stores.IceCreamStoreOne;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamStoreOneTest {
    ConeIceCream coneIceCream;
    IceCreamStore iceCreamStore;

    @Before
    public void setUo()
    {
        iceCreamStore = new IceCreamStoreOne();
    }
    @Test
    public void TestIceCreamGuavaMilk()
    {
        coneIceCream = iceCreamStore.orderIceCream("guava","milk");
        assertEquals(coneIceCream.getName(), "Helado de Guayaba a base de Leche");
    }
    @Test
    public void TestIceCreamGuavaWater()
    {
        coneIceCream = iceCreamStore.orderIceCream("guava","water");
        assertEquals(coneIceCream.getName(), "Helado de Guayaba a base de Agua");
    }

    @Test
    public void TestIceCreamMangoMilk()
    {
        coneIceCream = iceCreamStore.orderIceCream("mango","milk");
        assertEquals(coneIceCream.getName(), "Helado de Mango a base de Leche");
    }
    @Test
    public void TestIceCreamMangoWater()
    {
        coneIceCream = iceCreamStore.orderIceCream("mango","water");
        assertEquals(coneIceCream.getName(), "Helado de Mango a base de Agua");
    }

    @Test
    public void TestIceCreamPineappleMilk()
    {
        coneIceCream = iceCreamStore.orderIceCream("pineapple","milk");
        assertEquals(coneIceCream.getName(), "Helado de Pina a base de Leche");
    }
    @Test
    public void TestIceCreamPineappleWater()
    {
        coneIceCream = iceCreamStore.orderIceCream("pineapple","water");
        assertEquals(coneIceCream.getName(), "Helado de Pina a base de Agua");
    }

    @Test
    public void TestIceCreamStrawberryMilk()
    {
        coneIceCream = iceCreamStore.orderIceCream("strawberry","milk");
        assertEquals(coneIceCream.getName(), "Helado de Fresa a base de Leche");
    }
    @Test
    public void TestIceCreamStrawberryWater()
    {
        coneIceCream = iceCreamStore.orderIceCream("strawberry","water");
        assertEquals(coneIceCream.getName(), "Helado de Fresa a base de Agua");
    }

}
