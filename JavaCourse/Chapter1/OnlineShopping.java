package JavaCourse.Chapter1;

import java.util.ArrayList;
import java.util.List;

public class OnlineShopping {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "Doe", "johndoe@test.com"));
        customers.add(new Customer("Jane", "Doe", "janedoe@test.com"));
        customers.add(new Customer("Alice", "Smith", "alicesmith@test.com"));
        Product product = new Product("Laptop", 1000.0, 1);
        for (Customer customer : customers) {
            Order order = new Order(customer, product);
            System.out.println("Customer: " + order.getCustomer().getFirstName() + " " + order.getCustomer().getLastName());
            System.out.println("Product: " + product.getItemName());
            System.out.println("Product Price: " + product.getItemPrice());
            System.out.println("Product Quantity: " + product.getItemQuantity());

            System.out.println("-------------------------------------------------");
        }
    }
}


