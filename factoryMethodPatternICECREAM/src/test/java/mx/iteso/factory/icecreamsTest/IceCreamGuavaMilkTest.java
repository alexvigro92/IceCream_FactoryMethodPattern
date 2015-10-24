package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamGuavaMilk;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamGuavaMilkTest {
    ConeIceCream GuavaMilk;

    @Before
    public void SetUp(){
        GuavaMilk = new IceCreamGuavaMilk();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(GuavaMilk.getName(), "Helado de Guayaba a base de Leche");
    }
}
