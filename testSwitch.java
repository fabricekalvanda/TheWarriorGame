import java.util.*;

public class testSwitch{
   public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       String msg = "Please select a number:\n" + 
       "=======================\n" + 
       "1. Turn West\n" + 
       "2. Turn East\n" + 
       "3. Turn North\n" + 
       "4. Turn South\n";
       
       System.out.print(msg);
       int option = kb.nextInt();
              
       if (option > 4 || option < 1){
         // print error message
         System.out.println("You entered a wrong value....");
         System.exit(1);
       }
       
       switch (option) {
         case 1:
            System.out.println("The warrior turns west");
            break;
         case 2:
            System.out.println("The warrior turns east");
            break;
         case 3:
            weaponChoice(kb);            
            break;
         case 4:
            System.out.println("The warrior turns south");
            break;

       }
   }
   
   public static void weaponChoice(Scanner kb){
      System.out.println("The warrior turns north");
      System.out.println("Select your weapon!");
      String msg = "==================\n" + 
      "1. La Chancla\n" + 
      "2. Stick\n" +
      "3. Mean words\n";
      System.out.print(msg);
      
      int weapon = kb.nextInt();
      
      if ( weapon > 3 || weapon < 1){
         System.out.println("Wrong weapon!");
         System.exit(1);
      }
      
      switch(weapon){
         case 1:
            System.out.println("Everyone's dead");
            break;
         case 2:
            System.out.println("Some are dead");
            break;
         case 3:
            System.out.println("No one even got hurt");
            break;            
      }
   }
}