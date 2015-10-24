package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamGuavaWater;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamGuavaWaterTest {
    ConeIceCream GuavaWater;

    @Before
    public void SetUp(){
        GuavaWater = new IceCreamGuavaWater();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(GuavaWater.getName(), "Helado de Guayaba a base de Agua");
    }
}
