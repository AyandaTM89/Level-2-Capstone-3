import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// main class
public class Poised {
    //Scanner variable
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Poised menu GUI
        System.out.println("\t\t\nWELCOME TO POISED");
        System.out.println("_____________________________________________________________");
        String menu ;
        menu =  "\t1. VIEW PROJECTS\n";
        menu += "\t2. ADD NEW PROJECT\n";
        menu += "\t3. FIND PROJECT\n";
        menu += "\t4. UPDATE PROJECT\n";
        menu += "\t5. FINALISE PROJECT\n";
        menu += "\t6. UnCOMPLETE PROJECTS\n";
        menu += "\t7. OVER DUE DATE\n";
        menu += "\t0. EXIT\n";
        System.out.println("Please select Numbers\n");
        menu += "\t\nSelect from menu:  ";

        // array list to list on the the text file
        ArrayList<NewProject> projectList = new ArrayList<>();

        // while loop to loop thru menu options
        while(true) {
            // try catch block to handle exception that happens during selection in menu
            try {
                //menu print out
                System.out.println(menu);
                int options = Integer.parseInt(input.nextLine());

                // menu options project list
                if (options == 1){
                    System.out.println("PROJECT LIST");
                    viewProjects(projectList);
                }
                // create project option
                else if (options == 2) {
                    createNewProject(projectList);
                }
                // find or search for a project using project number
                else if (options == 3){
                    System.out.println("FIND/SEARCH PROJECT\n");
                    FindProject(projectList);
                }
                // update project option
                else if (options == 4){
                    System.out.println("UPDATE PROJECT\n");
                    UpDateProject(projectList);
                }
                // Finalise project option
                else if (options == 5){
                    System.out.println("FINALISE PROJECT");
                   FinaliseProject(projectList);
                }
                // to view all the incomplete projects
                else if (options == 6){
                    System.out.println("UNCOMPLETED PROJECT");
                    UnCompleteProject(projectList);
                }
                // Projects that already passed the due date
                else if (options == 7){
                    System.out.println("OVER DUE PROJECTS");
                    OverDueProject(projectList);
                }
                // system exits if the user selects 0
                else if (options == 0){
                    System.out.println("Good bye!!");
                    System.out.println("_____________________________________________________________");
                    break;
                }
                // exception handling if user selects wrong menu option
                System.out.println("_____________________________________________________________");
            }catch(Exception e){
                System.out.println("Please Enter a number");
                System.out.println("_____________________________________________________________");
            }
        }
    }

    // Viewing the available projects
    public static void viewProjects(ArrayList<NewProject>projectList)throws FileNotFoundException {
        try{
            File file = new File("CompleteProject.txt");
            Scanner reader = new Scanner(file);
            // while loop to loop thru the file while searching for the project
            while(reader.hasNext()){
                String line = reader.nextLine();
                line = line.replace("\n", "");
                String[] list = line.split(", ");
                System.out.println(Arrays.toString(list));
            }
        }catch(Exception e){
            System.out.println("Missing File");
            System.out.println("_____________________________________________________________________________________________________");
        }
    }
    // creating anew project
    public static  String createNewProject(ArrayList<NewProject>projectList) {

            System.out.println("NEW PROJECT");
            System.out.println("_____________________________________________________________");

            // user inputs
            System.out.println("Project Name: ");
            String ProjectName = input.nextLine();

            System.out.println("Project Number: ");
            int ProjectNumber = Integer.parseInt(input.nextLine());

            System.out.println("Building Type: ");
            String BuildingType = input.nextLine();

            System.out.println("Project Address: ");
            String ProjectAddress = input.nextLine();

            System.out.println("ERF Number: ");
            int ERFNumber = Integer.parseInt(input.nextLine());

            System.out.println("Fee Charged: ");
            int FeeCharged = Integer.parseInt(input.nextLine());

            System.out.println("Amount Paid: ");
            int AmountPaid = Integer.parseInt(input.nextLine());

            System.out.println("DeadLine: ");
            String DeadLine = input.nextLine();

            Scanner input = new Scanner(System.in);
            System.out.println("\nARCHITECT INFORMATION QUESTIONS:\n");

            // Architect Attributes
            System.out.println("Architect Name: ");
            String ArchitectName = input.nextLine();

            System.out.println("Architect Cell Number: ");
            int ArchitectNumber = Integer.parseInt(input.nextLine());

            System.out.println("Architect Email: ");
            String ArchitectEmail = input.nextLine();

            System.out.println("Architect Physical Address: ");
            String ArchitectAddress = input.nextLine();

            System.out.println("\nContractor INFORMATION QUESTIONS:\n");
            Scanner inpu = new Scanner(System.in);

            // Contractor Attributes
            System.out.println("Contractor Name: ");
            String ContractorName = input.nextLine();

            System.out.println("Contractor Cell Number: ");
            int ContractorNumber = Integer.parseInt(input.nextLine());

            System.out.println("Contractor Email: ");
            String ContractorEmail = input.nextLine();

            System.out.println("Contractor Physical Address: ");
            String ContractorAddress = input.nextLine();

            System.out.println("\nCUSTOMER INFORMATION QUESTIONS:\n");
            Scanner in = new Scanner(System.in);

            // Customer Attributes
            System.out.println("Customer Name: ");
            String CustomerName = input.nextLine();

            System.out.println("Customer Cell Number: ");
            int CustomerNumber = Integer.parseInt(input.nextLine());

            System.out.println("Contractor Email: ");
            String CustomerEmail = input.nextLine();

            System.out.println("Customer Physical Address: ");
            String CustomerAddress = input.nextLine();

            // New Project attributes
            NewProject newproject = new NewProject(ProjectName, ProjectNumber, ProjectAddress, BuildingType, ERFNumber,
                  FeeCharged, AmountPaid, DeadLine, ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress,
                  ContractorName, ContractorName, ContractorEmail, ContractorAddress, CustomerName, CustomerNumber,
                  CustomerEmail, CustomerAddress);
            projectList.add(newproject);

            // Project attributes
             Project project = new Project(ProjectNumber, ProjectName, ProjectAddress, BuildingType, ERFNumber,
                     FeeCharged, AmountPaid, DeadLine);
             projectList.add(newproject);

             // Architect object and its attributes
            Architect architect = new Architect (ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
            projectList.add(newproject);

            // contractor objects and its attribute
            Contractor contractor = new Contractor(ContractorName, ContractorNumber, ContractorEmail, ContractorAddress);
            projectList.add(newproject);

            // customer object and its attributes
            Customer customer = new Customer (CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
            projectList.add(newproject);


        try {
            FileWriter writer = new FileWriter("CompleteProject.txt", true);
            String results = project.getProjectName() +", "+ project.getProjectNumber()+", "+ project.getProjectAddress()+", " +
                    ""+ project.getBuildingType()+", "+ project.getERFNumber()+", "+ project.getFeeCharged()+"," +
                    " "+project.getAmountPaid()+", "+project.getDeadLine()+", "+ architect.getArchitectName()+", "+
                    architect.getArchitectNumber()+", "+architect.getArchitectEmail()+", "+architect.getArchitectAddress()+", "+
                    customer.getCustomerName()+", "+customer.getCustomerNumber()+", "+customer.getCustomerEmail()+", "+
                    customer.getCustomerAddress()+", "+contractor.getContractortName()+", "+contractor.getContractorNumber()+", " +
                    ""+contractor.getContractorEmail()+", "+contractor.getContractorAddress() + "\n";

            writer.write(results);
            writer.close();

        } catch (IOException e) {
            System.out.println("Specified File Not Found");
            System.out.println("_____________________________________________________________");

        }
        return "Project Saved";
        }

        // Searching or Finding the Project by name or Number
       public static String FindProject(ArrayList<NewProject>projectList) throws FileNotFoundException {

            // File reader to read thru the file
            File file = new File("CompleteProject.txt");
            Scanner reader = new Scanner(file);

            System.out.println("Enter Project Number: ");
            int ProjectNumber  = Integer.parseInt(reader.nextLine());

            String line = reader.nextLine();
            String[] list = line.split(", ");

                try{
                    while(reader.hasNextLine()){

                        line = reader.nextLine();

                        if (line.startsWith(list[1])) {
                            System.out.println(ProjectNumber);
                        }
                    }
                    // closing the file reader
                    reader.close();
                }catch(Exception e){
                    System.out.println("_____________________________________________________________");
                    System.out.println("ERROR !! ENTER A PROJECT NUMBER");

                }
                return " ";
        }
        // updating the existing project
    private static void UpDateProject(ArrayList<NewProject> projectList) {
        // try block to handle the out of bounds exception if theres no project
        try{
            File file = new File("CompleteProject.txt");
            Scanner scan = new Scanner(file);

            // while loop to loop thru the list
            while(scan.hasNext()){
                String line = scan.nextLine();
                line = line.replace("\n", "");
                String[] list = line.split(", ");
                System.out.println("Enter project Number: ");
                System.out.println("\nPROJECT UPDATED");
            }
        }catch(Exception e){
            System.out.println("NO PROJECT FILE");
            System.out.println("_____________________________________________________________");
        }
    }
    // Finalising the project and giving out the invoice to the customer
    public static String FinaliseProject(ArrayList<NewProject>projectList) {

        System.out.println("_____________________________________________________________");

        // writing to the invoice txt file
        // Invoice Attributes
        System.out.println("Customer Name: ");
        String CustomerName = input.nextLine();

        System.out.println("Customer Cell Number: ");
        int CustomerNumber = Integer.parseInt(input.nextLine());

        System.out.println("Contractor Email: ");
        String CustomerEmail = input.nextLine();

        System.out.println("Customer Physical Address: ");
        String CustomerAddress = input.nextLine();

        System.out.println("Fee Charged: ");
        int FeeCharged = Integer.parseInt(input.nextLine());

        System.out.println("Amount Paid: ");
        int AmountPaid = Integer.parseInt(input.nextLine());

        // New Project attributes
        NewProject newproject = new NewProject(FeeCharged, AmountPaid);
        projectList.add(newproject);

        Customer cus = new Customer (CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
        projectList.add(newproject);

        //try catch block to handle file not existing exception
        try {
            FileWriter writer = new FileWriter("Invoice.txt", true);

            String statement = cus.getCustomerName()+", "+cus.getCustomerNumber()+", "+cus.getCustomerEmail()+", "+
                    cus.getCustomerAddress()+",  "+newproject.getFeeCharged()+", "+newproject.getAmountPaid() + "\n";

            writer.write(statement);
            writer.close();

            System.out.println("PROJECT FINALISED");

        } catch (IOException e) {
            System.out.println("Specified File Not Found");
            System.out.println("_____________________________________________________________");
        }
        return "INVOICE SAVED";
    }

    // checking the over due projects
    // Listing projects by number and name
    public static void OverDueProject(ArrayList<NewProject>projectList){

            // try catch block to handle all the errors
            try{
                File file = new File("CompleteProject.txt");
                Scanner scan = new Scanner(file);

                // while loop to loop thru the list
                while(scan.hasNext()){
                    String line = scan.nextLine();
                    String[] list = line.split(", ");

                    //printing out over due projects
                    System.out.println("\nPROJECT NUMBER: " + list[1] + " "+ "IS OVER DUE" + "and" + "PROJECT NAME: " + list[0]);
                    break;
                }
            }catch(Exception e){
                System.out.println("NO PROJECT FILE");
                System.out.println("_____________________________________________________________");
            }
         }
    // checking the uncompleted  projects
    public static void UnCompleteProject(ArrayList<NewProject>projectList){

        // try catch block to handle all the errors
        try{
            File file = new File("CompleteProject.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNext()){
                System.out.println("All Projects are Completed");
                break;
            }
        }catch(Exception e){
            System.out.println("ERROR !!");
            System.out.println("_____________________________________________________________");
        }
    }
}
