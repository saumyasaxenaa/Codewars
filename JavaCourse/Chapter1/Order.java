package JavaCourse.Chapter1;

public class Order {
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product){
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
