package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamStrawberryWater;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamStrawberryWaterTest {
    ConeIceCream StrawberryWater;

    @Before
    public void SetUp(){
        StrawberryWater = new IceCreamStrawberryWater();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(StrawberryWater.getName(), "Helado de Fresa a base de Agua");
    }
}
