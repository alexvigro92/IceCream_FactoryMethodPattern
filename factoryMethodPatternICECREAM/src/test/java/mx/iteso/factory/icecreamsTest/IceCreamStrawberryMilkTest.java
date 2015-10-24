package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamStrawberryMilk;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamStrawberryMilkTest {
    ConeIceCream StrawberryMilk;

    @Before
    public void SetUp(){
        StrawberryMilk = new IceCreamStrawberryMilk();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(StrawberryMilk.getName(), "Helado de Fresa a base de Leche");
    }
}
