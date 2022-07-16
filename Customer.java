// customer class
public class Customer {
    // defining the variables and data types
    private String CustomerName;
    private int CustomerNumber;
    private String CustomerEmail;
    private String CustomerAddress;

    // attributes of Customer class
    public Customer(String CustomerName, int CustomerNumber, String CustomerEmail, String CustomerAddress){

        this.setCustomerName(CustomerName);
        this.setCustomerNumber(CustomerNumber);
        this.setCustomerEmail(CustomerEmail);
        this.setCustomerAddress(CustomerAddress);
    }
    //toString methods to display values
    public String toString(String ArchitectEmail) {
        String output = "Customer Name: " + getCustomerName();
        output += "\nCell Number:" + getCustomerNumber();
        output += "\nCustomer Address: " + getCustomerAddress();
        return output;
    }
    public String getCustomerEmail() {
        return CustomerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public int getCustomerNumber() {
        return CustomerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        CustomerNumber = customerNumber;
    }
    public String getCustomerAddress() {
        return CustomerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }
}
