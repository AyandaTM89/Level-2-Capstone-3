// defining class Contractor
public class Contractor {

    // defining the variables and data types
    private String ContractortName;
    private int ContractorNumber;
    private String ContractorEmail;
    private String ContractorAddress;

    // Contractor constructor and the attributes
    public Contractor(String ContractortName, int ContractorNumber, String ContractorEmail, String ContractortAddress){

        this.setContractortName(ContractortName);
        this.setContractorNumber(ContractorNumber);
        this.setContractorEmail(ContractorEmail);
        this.setContractorAddress(ContractortAddress);
    }
    // toString methods to display values
    public String toString(String ContractorEmail) {
        String output = extracted();
        return output;

    }
    protected String extracted() {
        String output = "Contractor Name: " + getContractortName();
        output += "\nCell Number:" + getContractorNumber();
        output += "\nContractort Email : " + getContractorEmail();
        output += "\nAddress: " + getContractorAddress();
        return output;
    }
    // getters and setters
    public String getContractortName() {
        return ContractortName;
    }

    public void setContractortName(String contractortName) {
        ContractortName = contractortName;
    }

    public int getContractorNumber() {
        return ContractorNumber;
    }

    public void setContractorNumber(int contractorNumber) {
        ContractorNumber = contractorNumber;
    }

    public String getContractorEmail() {
        return ContractorEmail;
    }

    public void setContractorEmail(String contractorEmail) {
        ContractorEmail = contractorEmail;
    }

    public String getContractorAddress() {
        return ContractorAddress;
    }

    public void setContractorAddress(String contractorAddress) {
        ContractorAddress = contractorAddress;
    }
}
