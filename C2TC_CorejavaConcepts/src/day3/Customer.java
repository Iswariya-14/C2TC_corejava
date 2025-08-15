package day3;

public class Customer 
{
	private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public Customer() {
        System.out.println("Default constructor invoked");
    }

    // Parameterized constructor
    public Customer(String name, int id, String city) {
        this.customerName = name;
        this.customerId = id;
        this.customerCity = city;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + customerId + ", Name=" + customerName + ", City=" + customerCity + "]";
    }
}