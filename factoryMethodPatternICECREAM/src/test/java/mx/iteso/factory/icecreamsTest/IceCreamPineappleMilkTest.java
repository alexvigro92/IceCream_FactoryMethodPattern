package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamPineappleMilk;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamPineappleMilkTest {
    ConeIceCream PineappleMilk;

    @Before
    public void SetUp(){
        PineappleMilk = new IceCreamPineappleMilk();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(PineappleMilk.getName(), "Helado de Pina a base de Leche");
    }
}
