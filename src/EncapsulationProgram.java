import java.util.Scanner;

     class Bank {
         private final int Balance = 50000;
         private int pin;

         void Deposit()
         {
             System.out.print("Enter your pin");
             Scanner a = new Scanner(System.in);
             int pin = a.nextInt();
             if (pin == 101)
             {
                 System.out.println("Enter Amount");
                 Scanner b = new Scanner(System.in);
                 int amount = b.nextInt();
                 amount = Balance + amount;
                 System.out.println("Balance is=" + Balance + "after deposit =" + amount);

             }
             else
             {
                 System.out.print("Wrong Pin");
             }
         }

         void Withdraw()
         {
             Scanner a = new Scanner(System.in);
             int pin = a.nextInt();
             if (pin == 101)
             {
                 System.out.println("Enter Amount");
                 Scanner b = new Scanner(System.in);
                 int amount = b.nextInt();
                 if (Balance >= amount)
                 {
                     amount = Balance - amount;
                     System.out.println("Balance is=" + Balance + "after withdraw =" + amount);
                 }
                 else
                 {
                     System.out.println("Insufficient balance");
                 }
             }
         }
     }

          class EncapsulationProgram
         {
        public static void main (String[] args)
        {
            System.out.println("Enter 1 for Deposit");
            System.out.println("Enter 2 for Withdraw");
            System.out.println("Enter input");
            Scanner b=new Scanner (System.in);
            int input=b.nextInt();
            Bank c=new Bank();

            switch(input)
            {
                case 1:
                    c.Deposit();
                    break;
                case 2:
                    c.Withdraw();
                    break;
                default:
                    System.out.println("Enter valid Input");
            }
        }
    }



