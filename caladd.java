import java.util.Scanner;

    public class caladd{
        public static void main(String args[]){
            float a, b, res;
            char choice, ch;
            Scanner scan = new Scanner(System.in);

            do{
                System.out.print("1. Add Two numbers\n");
                System.out.print("2. Multiply two numbers\n");
                System.out.print("3. Exit\n");
                System.out.print("4. Divide two numbers\n");
                System.out.print("Enter Your choice: \n");
                choice = scan.next().charAt(0);
                switch(choice){
                    case '1' : System.out.print("Enter Two numbers: ");
                               a = scan.nextFloat();
                               b = scan.nextFloat();
                               res = a + b;
                               System.out.print("Result = " + res);
                               break;
                    case '2' : System.out.print("Enter Two numbers: ");
                               a = scan.nextFloat();
                               b = scan.nextFloat();
                               res = a * b;
                               System.out.print("Result = " + res);
                               break;
                    
                    case '3' : System.exit(0);
                               break;
                    case '4' : System.out.print("Enter Two numbers: ");
                               a = scan.nextFloat();
                               b = scan.nextFloat();
                               res = a / b;
                               System.out.print("Result = " + res);
                               break;
                               break;
                    default : System.out.print("INVALID");
                              break;
                }
                System.out.print("\n--------------\n");
            }
            while(choice != 2);
        }
    }
