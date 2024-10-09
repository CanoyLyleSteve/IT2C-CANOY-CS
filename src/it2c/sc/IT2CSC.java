
package it2c.sc;
import java.util.Scanner;
public class IT2CSC {

   
     
       
        public void addPeople(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("ADDRESS: ");
        String address = sc.next();
        System.out.print("CONTACTN: ");
        String contactn = sc.next();

      String sql = "INSERT INTO tbl_Salesportcars (sc_fname, sc_lname, sc_address, sc_contactn) VALUES (?, ?, ?, ?)";

        conf.addRecord(sql, fname, lname, address, contactn);
   }
        
         public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String response;

        int nums = 0;
        String op;

        do{

        System.out.println("Welcome to Grading App");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("-------------------------------------");

        System.out.print("Enter Action: ");
        int action = sc.nextInt();
        IT2CSC salescars = new IT2CSC ();
        switch(action){
            case 1:
                salescars.addCustomer();
                break;
            case 2: 
                salescars.viewCustomer();
            break;
            case 3: 
                salescars.viewCustomer();
                salescars.updateCustomer();
                salescars.viewCustomer();
                break;
            case 4: 
                 salescars.viewCustomer();
                 salescars.deleteCustomer();
                  salescars.viewCustomer();
                break;
            case 5: 
                System.out.println("EXITING......");
                break;
            default: 
                System.out.println("INVALID Action. Please try again ");
    
        }
        System.out.println("Continue? (yes/no):");
        response=sc.next();
        
        }while(response.equals("yes"));
             System.out.println("THANK YOU FOR USING");
        
         }
             public void addCustomer(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("First Name: ");
            String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("ADDRESS: ");
        String address = sc.next();
        System.out.print("Contactn: ");
         String contactn = sc.next();
       
        
        String sql = "INSERT INTO tbl_Salesportcars (sc_fname, sc_lname, sc_address, sc_contactn) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, address, contactn);
}
             private void viewCustomer() {
        String votersQuery = "SELECT * FROM tbl_Salesportcars";
        String[] votersHeaders = {"ID", "Name", "Birthdate", "Email", "Status"};
        String[] votersColumns = {"sc_id", "sc_fname", "sc_lname", "sc_address", "sc_contactn"};
        config conf = new config();
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
        public void updateCustomer() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Customer ID:");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter the new name:");
            String fname= sc.nextLine();
             System.out.print("Enter the new lastname:");
            String lname= sc.nextLine();
             System.out.print("Enter the new Address:");
            String address= sc.nextLine();
             System.out.print("Enter the new Contactn:");
            String contactn= sc.nextLine();
         String sql = "UPDATE tbl_Salesportcars SET sc_fname = ?, sc_lname = ?, sc_address = ?, sc_contactn = ? WHERE sc_id =? ";
         config conf = new config();
         conf.updateRecord(sql, fname, lname, address, contactn, id);
    }
        public void deleteCustomer() {
           Scanner sc = new Scanner(System.in);
            System.out.print("Enter customer ID to delete");
        int id = sc.nextInt();
        String sqlDelete = "Delete from tbl_Salesportcars WHERE sc_id = ?";
        config conf = new config();
        conf.deleteCustomer(sqlDelete, id);
    }
}


