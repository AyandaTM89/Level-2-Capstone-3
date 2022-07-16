public class Project {
    // defining the variables and data types
    private int ProjectID;
    private String ProjectName;
    private int ProjectNumber;
    private String BuildingType;
    private String ProjectAddress;
    private int ERFNumber;
    private int FeeCharged;
    private int AmountPaid;
    private String DeadLine;

    // Project Attributes
    public Project(int ProjectID, String ProjectName, String BuildingType, String ProjectAddress,
                   int ERFNumber, int FeeCharged, int AmountPaid, String DeadLine) {
        this.setProjectID(ProjectID);
        this.setProjectName(ProjectName);
        this.setProjectNumber(ProjectNumber);
        this.setBuildingType(BuildingType);
        this.setProjectAddress(ProjectAddress);
        this.setERFNumber(ERFNumber);
        this.setBuildingType(BuildingType);
        this.setAmountPaid(AmountPaid);
        this.setDeadLine(DeadLine);

    }
    //toString methods to display values
    public String toString(String ProjectName) {
        String output = "Project Name: " + ProjectName;
        output += "\nProject ID:" + getProjectID();
        output += "\nProject Number: " + getProjectNumber();
        output += "\nBuilding Type:  " + getBuildingType();
        output += "\nProject Number: " + getProjectAddress();
        output += "\nERF Number:" + getERFNumber();
        output += "\nFee Charged:  " + getFeeCharged();
        output += "\nAmount Paid: " + getAmountPaid();
        output += "\nDead Line: "+ getDeadLine();
        return output;
    }
    public int getProjectID() {
        return ProjectID;
    }

    public void setProjectID(int projectID) {
        ProjectID = projectID;
    }

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

    public void setERFNumber(int ERFNumber) {
        this.ERFNumber = ERFNumber;
    }

    public int getFeeCharged() {
        return FeeCharged;
    }

    public void setFeeCharged(int feeCharged) {
        FeeCharged = feeCharged;
    }

    public int getAmountPaid() {
        return AmountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        AmountPaid = amountPaid;
    }

    public String getDeadLine() {
        return DeadLine;
    }

    public void setDeadLine(String deadLine) {
        DeadLine = deadLine;
    }
}

