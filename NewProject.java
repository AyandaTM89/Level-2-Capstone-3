public class NewProject {
    // defining the variables and data types
     String ProjectName;
     int ProjectNumber;
     String BuildingType;
     String ProjectAddress;
     int ERFNumber;
     Double FeeCharged;
     Double AmountPaid;
     String DeadLine;

    // New Project Attributes
    public NewProject(String projectName, int projectNumber, String projectAddress, String buildingType, int erfNumber,
                      int feeCharged, int amountPaid, String deadLine, String architectName, int architectNumber,
                      String architectEmail, String architectAddress, String contractorName, String contractorName1,
                      String contractorEmail, String contractorAddress, String customerName, int customerNumber,
                      String customerEmail, String customerAddress) {

        this.setProjectName(ProjectName);
        this.setProjectNumber(ProjectNumber);
        this.setBuildingType(BuildingType);
        this.setProjectAddress(ProjectAddress);
        this.setERFNumber(ERFNumber);
        this.setBuildingType(BuildingType);
        this.setAmountPaid(AmountPaid);
        this.setDeadLine(DeadLine);
    }

    public NewProject() {

    }

    public NewProject(int feeCharged, int amountPaid) {
        this.setFeeCharged(FeeCharged);
        this.setAmountPaid(AmountPaid);
    }

    //toString methods to display values
    public String toString(String ProjectName) {
        String output = "Project Number: " + getProjectNumber();
        output += "\nProject Name: " + ProjectName;
        output += "\nBuilding Type:  " + getBuildingType();
        output += "\nProject Address: " + getProjectAddress();
        output += "\nERF Number:" + getERFNumber();
        output += "\nFee Charged:  " + getFeeCharged();
        output += "\nAmount Paid: " + getAmountPaid();
        output += "\nDead Line: "+ getDeadLine();
        return output;

    }
// getters and setters of NewProject
    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public int getProjectNumber() {
        return ProjectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        ProjectNumber = projectNumber;
    }

    public String getBuildingType() {
        return BuildingType;
    }

    public void setBuildingType(String buildingType) {
        BuildingType = buildingType;
    }

    public String getProjectAddress() {
        return ProjectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        ProjectAddress = projectAddress;
    }

    public int getERFNumber() {
        return ERFNumber;
    }
    // getters and setters of NewProject
    public void setERFNumber(int ERFNumber) {
        this.ERFNumber = ERFNumber;
    }

    public Double getFeeCharged() {
        return FeeCharged;
    }

    public void setFeeCharged(Double feeCharged) {
        FeeCharged = feeCharged;
    }

    public Double getAmountPaid() {
        return AmountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        AmountPaid = amountPaid;
    }

    public String getDeadLine() {
        return DeadLine;
    }

    public void setDeadLine(String deadLine) {
        DeadLine = deadLine;
    }
}

