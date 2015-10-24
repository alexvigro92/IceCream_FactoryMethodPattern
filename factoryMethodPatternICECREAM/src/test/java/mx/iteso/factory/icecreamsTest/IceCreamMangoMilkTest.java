package mx.iteso.factory.icecreamsTest;

import mx.iteso.factory.ConeIceCream;
import mx.iteso.factory.icecreams.IceCreamMangoMilk;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/23/2015.
 */
public class IceCreamMangoMilkTest {
    ConeIceCream MangoMilk;

    @Before
    public void SetUp(){
        MangoMilk = new IceCreamMangoMilk();
    }

    @Test
    public void iceCreamGuavaMilkTest(){
        assertEquals(MangoMilk.getName(), "Helado de Mango a base de Leche");
    }
}
