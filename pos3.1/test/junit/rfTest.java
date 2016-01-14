package junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class rfTest {
rf rftest;
    String path;
    @Before
    public void setUp() throws Exception {
        path="E:\\pos3.1\\src\\junit\\d5m";
rftest=new rf();
    }

    @Test
    public void testReadFile() throws Exception {
assertEquals("{\"USER001\":{\"name\":\"USER 001\",\"vc\":29,\"isVip\":true},\"USER002\":{\"name\":\"USER 002\",\"vc\":0,\"isVip\":false},\"USER003\":{\"name\":\"USER 003\",\"vc\":20,\"isVip\":true}}",rftest.ReadFile(path));
    }
}