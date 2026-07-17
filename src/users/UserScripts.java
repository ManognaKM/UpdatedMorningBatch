package users;

import org.testng.annotations.Test;

public class UserScripts {

    @Test
    public void createUser(){
        System.out.println("User created successful");
    }

    @Test
    public void modifyUser(){
        System.out.println("User modified successful");
    }

    @Test
    public void deleteUser(){
        System.out.println("User deleted successful");
    }
}
