package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamPineappleWater;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamPineappleWaterTest {
    ConeIceCream PineappleWater;

    @Before
    public void SetUp(){
        PineappleWater = new IceCreamPineappleWater();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(PineappleWater.getName(), "Helado de Pina a base de Agua");
    }
}
