package login.Junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
    @Test
    public void test2(){
        assertEquals("abc", "abc");
    }
    @Test
    public void test3(){
        assertEquals("java", "java");
    }
}