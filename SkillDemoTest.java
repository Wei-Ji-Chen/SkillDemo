import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test 
    public void subtract(){
        assertEquals(3, SkillDemo.subtract(5,2)); 
    }
    
}
