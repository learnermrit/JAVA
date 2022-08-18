// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class Account{  //Abstract Class Account
  String  accno, name;
  int balance;
 abstract void displayBalance();  //Abstract methods
  abstract void Deposite(int x);
  abstract void Withdraw(int x);
}

class SavingAccount extends Account{
    String type="Saving";                   //Derived class extends Account
    int interest_rate;
   void displayBalance(){
       System.out.println("Balance= "+ balance);
       
   }
   void Deposite(int x){
       balance+=x;
       displayBalance();
   }
   void Withdraw(int x){
       if(balance>=x){
           balance-=x;
            displayBalance();
       }
       else{
            System.out.println("Low Balance");
       }
   }
   
   void calculateInterest(int period){
       int intrest=(balance*period*interest_rate)/100;
       System.out.println("intrest ="+ intrest);
   }
    
}
class CurrentAccount extends Account{
     String type="Current";
    int interest_rate;
   void displayBalance(){
       System.out.println("Balance= "+ balance);
       
   }
   void Deposite(int x){
       balance+=x;
       displayBalance();
   }
   void Withdraw(int x){
       if(balance>=x){
           balance-=x;
            displayBalance();
       }
       else{
            System.out.println("Low Balance");
       }
   }
    void calculateInterest(int period){
       int intrest=(balance*period*interest_rate)/100;
       System.out.println("intrest ="+ intrest);
   }
    
}
class HelloWorld {
    public static void main(String[] args) {
      
      SavingAccount sva=new SavingAccount();
      sva.Withdraw(50);  // here we can observe the use of abstract method as we are using 
                        //in defined in derived class
        
    }
}