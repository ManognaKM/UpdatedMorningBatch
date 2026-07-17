package customer;

import org.testng.annotations.Test;

public class CustomerScripts {


    @Test
    public void createCustomer(){
        System.out.println("Customer created successful");
    }

    @Test
    public void modifyCustomer(){
        System.out.println("Customer modified successful");
    }

    @Test
    public void deleteCustomer(){
        System.out.println("Customer deleted successful");
    }

}
