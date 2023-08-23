package Sporty.Shoes;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginPageTests {
    
    @Test
    public void testValidLogin() {
        
        assertTrue(loginUser("validUsername", "validPassword"));
    }
    
   
    private boolean loginUser(String username, String password) {
        
        if ("validUsername".equals(username) && "validPassword".equals(password)) {
            return true; // Login successful
        } else {
            return false; // Login failed
        }
    }
}
