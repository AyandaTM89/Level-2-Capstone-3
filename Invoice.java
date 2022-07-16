// customer class
public class Invoice {
    // defining the variables and data types
    String CustomerName1;
    int CustomerNumber1;
    String CustomerEmail1;
    String CustomerAddress1;
    int AmountPaid1;
    int FeeCharged1;

    // attributes of Customer class
    // constructor
    public Invoice(String CustomerName1, int CustomerNumber1, String CustomerEmail1,
                   String CustomerAddress1, int AmountPaid1, int FeeCharged1){
        this.setCustomerName1(CustomerName1);
        this.setCustomerNumber1(CustomerNumber1);
        this.setCustomerEmail1(CustomerEmail1);
        this.setCustomerAddress1(CustomerAddress1);
        this.setAmountPaid1(AmountPaid1);
        this.setFeeCharged1(FeeCharged1);

    }
    //toString methods to display values
    public String toString(String ArchitectEmail) {
        String output = "Customer Name: " + getCustomerName1();
        output += "\nCell Number: " + getCustomerNumber1();
        output += "\nCustomer Email: " + getCustomerEmail1();
        output += "\nCustomer Address: " + getCustomerAddress1();
        output += "\nAmount Paid: " + getAmountPaid1();
        output += "\nFee Charged: " + getFeeCharged1();
        return output;

    }

    public String getCustomerName1() {
        return CustomerName1;
    }

    public void setCustomerName1(String customerName1) {
        CustomerName1 = customerName1;
    }

    public int getCustomerNumber1() {
        return CustomerNumber1;
    }

    public void setCustomerNumber1(int customerNumber1) {
        CustomerNumber1 = customerNumber1;
    }

    public String getCustomerEmail1() {
        return CustomerEmail1;
    }

    public void setCustomerEmail1(String customerEmail1) {
        CustomerEmail1 = customerEmail1;
    }

    public String getCustomerAddress1() {
        return CustomerAddress1;
    }

    public void setCustomerAddress1(String customerAddress1) {
        CustomerAddress1 = customerAddress1;
    }

    public int getAmountPaid1() {
        return AmountPaid1;
    }

    public void setAmountPaid1(int amountPaid1) {
        AmountPaid1 = amountPaid1;
    }

    public int getFeeCharged1() {
        return FeeCharged1;
    }

    public void setFeeCharged1(int feeCharged1) {
        FeeCharged1 = feeCharged1;
    }
}
