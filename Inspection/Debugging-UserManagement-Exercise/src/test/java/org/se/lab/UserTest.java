package org.se.lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest
{
    private User u;
    private int id;
    private String username;
    private String password;

    @Before
    public void setup(){
        id = 3;
        username = "homer";
        password = "*****";

        u = new User(id, username, password);
    }

    @Test
    public void testConstructor()
    {
        Assert.assertEquals(id, u.getId());
        Assert.assertEquals(username, u.getUsername());
        Assert.assertEquals(password, u.getPassword());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorUsernameIsNull()
    {
        new User(id, null, password);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPasswordIsNull()
    {
        new User(id, username, null);
    }
    
    @Test
    public void testToString()
    {
        final String EXPECTED = "3,homer,*****";        
        Assert.assertEquals(EXPECTED, u.toString());
    }
    
}
