package junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class vipmessageTest {
    vipmessage vm;
    String k;
    ArrayList<vip>vip;
    @Before
        public void setUp() throws Exception {

        vip = new ArrayList<vip>();
        vip a1 = new vip();
        a1.setvip(true);
        a1.setVc(29);
        a1.setMember("USER001");
        vip a2 = new vip();
        a2.setvip(false);
        a2.setVc(0);
        a2.setMember("USER002");
        vip a3 = new vip();
        a3.setvip(true);
        a3.setVc(20);
        a3.setMember("USER003");
        vip.add(a1);
        vip.add(a2);
        vip.add(a3);
       k="";
        for (vip  b: vip) {
            k+= b.getvip();
            k+= b.getVc();
            k+= b.getMember() + " ";
        }
        vm = new vipmessage();
    }

    @Test
    public void testFortest() throws Exception {
        assertEquals(k,vm.fortest());
    }
}