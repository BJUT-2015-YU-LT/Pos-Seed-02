package junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class ItemListTest {

    ItemList IL;
    ArrayList<String> l;
    @Before
    public void setUp() throws Exception {
        l=new ArrayList<String>();
        l.add("ITEM000000");
        l.add("ITEM000001");
        l.add("ITEM000001");


        IL=new ItemList();
    }
    @Test
    public void testGetmList() throws Exception {
        assertEquals(l,IL.fortest());
    }
}