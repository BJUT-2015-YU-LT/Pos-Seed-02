package junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class ShopCartTest {
    ShopCart SC;
    ArrayList<cm> cm1;
    String k;
    @Before
    public void setUp() throws Exception {
        cm1=new ArrayList<cm>();
        cm a= new cm();
        a.setbat("ITEM000000");
        a.setname("可口可乐");
        a.setpri(3.00);
        a.setuit("瓶");
        a.setvipdiscount(0.9);
        a.addnum();


        cm a1= new cm();
        a1.setbat("ITEM000001");
        a1.setname("雪碧");
        a1.setpri(3.00);
        a1.setuit("瓶");
        a1.setcont(0.8);
        a1.setvipdiscount(0.95);
        a1.addnum();
        a.addnum();

        cm a2= new cm();
        a2.setbat("ITEM000003");
        a2.setname("电池");
        a2.setpri(5.00);
        a2.setuit("个");
        a2.addnum();

        cm1.add(a);
        cm1.add(a1);
        cm1.add(a2);
        k="";
        for(cm b:cm1) {
            k+=b.getbat();
        }
        SC=new ShopCart();
    }
    @Test
    public void testGetAllItem() throws Exception {
        assertEquals(k,SC.fortest());
    }
}