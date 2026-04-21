public class Bank {

private String owner ;
private double balance ;

    public Bank(String owner, double balance) {

        if(balance < 0) {

            System.out.println("The balance can't be negative.");

            this.owner = owner ;
        }

         else {
            this.owner = owner;
            this.balance = balance;
        }

    }

   public String getOwner() {

   return owner ;
    }

    public double getBalance() {

        return balance ;

       }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {

        if(amount < 0) {

            System.out.println("The money you draw can't be negative");
        }

        else if (amount> balance) {

            System.out.println("You can't draw money higher than your balance.");

        }

        else {
            this.balance = this.balance - amount;

        }
        }
    }


