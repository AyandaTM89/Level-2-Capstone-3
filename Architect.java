// Architect class
public class Architect {
    // defining the variables and data types
    private String ArchitectName;
    private int ArchitectNumber;
    private String ArchitectEmail;
    private String ArchitectAddress;


    // Architecter attributes
    public Architect(String ArchitectName, int ArchitectNumber, String ArchitectEmail, String ArchitectAddress){

        this.setArchitectName(ArchitectName);
        this.setArchitectNumber(ArchitectNumber);
        this.setArchitectAddress(ArchitectAddress);
        this.setArchitectEmail(ArchitectEmail);
    }
    //toString methods to display values
    public String toString(String ArchitectEmail) {
        String output = "Name: " + getArchitectName();
        output += "\nCell Number:" + getArchitectNumber();
        output += "\nEmail:  " + ArchitectEmail;
        output += "\nAddress: " + getArchitectAddress();
        return output;
    }
    // getters and Setters
    public String getArchitectName() {
        return ArchitectName;
    }

    public void setArchitectName(String architectName) {
        ArchitectName = architectName;
    }

    public int getArchitectNumber() {
        return ArchitectNumber;
    }

    public void setArchitectNumber(int architectNumber) {
        ArchitectNumber = architectNumber;
    }

    public String getArchitectEmail() {
        return ArchitectEmail;
    }

    public void setArchitectEmail(String architectEmail) {
        ArchitectEmail = architectEmail;
    }

    public String getArchitectAddress() {
        return ArchitectAddress;
    }

    public void setArchitectAddress(String architectAddress) {
        ArchitectAddress = architectAddress;
    }
}
