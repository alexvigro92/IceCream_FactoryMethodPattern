package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamMangoWater;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamMangoWaterTest {
    ConeIceCream MangoWater;

    @Before
    public void SetUp(){
        MangoWater = new IceCreamMangoWater();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(MangoWater.getName(), "Helado de Mango a base de Agua");
    }
}
