
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
        switch(action){
            case 1:
        
        IT2CSC salescars = new IT2CSC ();
        salescars.addPeople();
        break;
    
        }
        System.out.println("Continue? (yes/no):");
        response=sc.next();
        
        }while(response.equals("yes"));
             System.out.println("THANK YOU FOR USING");
        
         }
}
        