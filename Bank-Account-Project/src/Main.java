import java.util.* ;

  public class Main {

      public static void main(String[] args) {

          int choice;
          int deposit;
          int choice1;
          int draw ;
          int choice2;
          String name ;

          Scanner inp = new Scanner(System.in);

          System.out.println("Please enter your first name and surname");



          Bank account = new Bank( name = inp.nextLine(), 300);

          System.out.println("Welcome to our bank account application " + account.getOwner() + " please select the operation you want.");

          while (true) {

              System.out.println("1- Deposit Money");
              System.out.println("2- Draw Money");
              System.out.println("3- Show Current Money");
              System.out.println("4- Exit");


              choice = inp.nextInt();

              if (choice == 3) {

                  System.out.println("Your current money is " + account.getBalance() + "₺");

              }

               else if (choice == 4) {

                  System.out.println("Thank you for using our program see you " +account.getOwner());

                  System.exit(0);
              }
                  else if (choice == 1) {

                  System.out.println("Your current money is " + account.getBalance() + "₺");
                  System.out.println("How much money you wanna deposit?: ");


                  account.deposit(deposit = inp.nextInt());

                  System.out.println("Your current money is " + account.getBalance() + "₺");
                  System.out.println("If you still want to deposit money press 1 if you want to go back press 0");

                  choice1 = inp.nextInt();

                  while (choice1 == 1) {

                      System.out.println("Your current money is " + account.getBalance() + "₺");
                      System.out.println("How much money you wanna deposit?: ");


                      account.deposit(deposit = inp.nextInt());

                      System.out.println("Your current money is " + account.getBalance() + "₺");
                      System.out.println("If you still want to deposit money press 1 if you want to go back press 0");

                      choice1 = inp.nextInt();
                    }


              }

             else if(choice == 2) {

                 System.out.println("Your current money is " + account.getBalance() + "₺");
                 System.out.println("How much money you wanna draw?");

                 account.withdraw(draw = inp.nextInt());

                 System.out.println("Your current money is " + account.getBalance() + "₺");
                 System.out.println("If you still want to draw money press 1 if you want to go back press 0");

                choice2 = inp.nextInt();

             while(choice2 == 1) {

                 System.out.println("Your current money is " + account.getBalance() + "₺");
                 System.out.println("How much money you wanna draw?");

                 account.withdraw(draw = inp.nextInt());

                 System.out.println("Your current money is " + account.getBalance() + "₺");
                 System.out.println("If you still want to draw money press 1 if you want to go back press 0");

                 choice2 = inp.nextInt();
             }
             }

          else {

                  System.out.println("Please input a valid operation");

          }
          }

      }
  }