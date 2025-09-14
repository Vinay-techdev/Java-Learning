package chapter_02;

public class Conditional {

	public static void main(String[] args) {
		/* if else 

		String name = "vinay";
        int Roll = 21;
        
        if (name.equals("Mohan") && Roll == 26) {
            System.out.println("Details of Mohan.");
        } else {
            System.out.println("Invalid details.");
        } */
        
		// else if ladder
        String name[] = {"Mohan", "Rohan", "Soham"};
        int Roll[] = {25, 36, 71};
        
        if (name[0] == "Mohan" && Roll[1] == 25) {
            System.out.println("Details of Mohan.");
        } else if (name[2] == "Rohan" && Roll[1] == 36) {
            System.out.println("Details of Rohan.");
        } else if (name[2] == "Soham" && Roll[2] == 71) {
            System.out.println("Details of Soham.");
        } else {
            System.out.println("Invalid details.");
        }
        
        // Switch statement
        String day = "Wednesday";
        
        switch (day) {
          case "Sunday":
            System.out.println("Today is Sunday");
            break;
            
          case "Monday":
            System.out.println("Today is Monday");
            break;
            
          case "Tuesday":
            System.out.println("Today is Tuesday");
            break;
            
          case "Wednesday":
            System.out.println("Today is Wednesday");
            break;
            
          case "Thursday":
            System.out.println("Today is Thursday");
            break;
            
          case "Friday":
            System.out.println("Today is Friday");
            break;
            
          case "Saturday":
            System.out.println("Today is Saturday");
            break;
        }
      
        
        for(int n = 1; n <= 20; n++) {
            if(n % 2 == 0) {
            	
                if (n == 8) {
                	continue;
                }
                
                if (n == 12) {
                    break;
                }
                System.out.println(n);
            }
        }

	}

}
