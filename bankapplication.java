import java.util.*;
public class BankApplication
{
    public static void main(String args[])
    {

    }
}
class Bankaccount
{
    int balance;
    int previousTransaction;
    int customerName;
    int customerId;
    Bankaccount(String cname,String cid)
    {
        customerName=cname;
        customerId=cid;

    }
    void deposit(int amount)
    {
        if(amount !=0)
        {
            balance+=amount;
            previousTransaction=amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount !=0)
        {
            balance-=amount;
            previousTransaction=-amount;
        }
    }
    void getpreviousTransaction()
    {
        if(previousTransaction>0)
        {
            System.out.println("Deposited:"+previousTransaction);
        }
        else
        {
             System.out.println("Withdrwal:"+Math.abs(previousTransaction));
        }
        
    }
    void showmenu()
    {
       char options='\0';
       Scanner sc=new Scanner(System.in);
       System.out.println("Welcome"+customerName);
       System.out.println("your ID is"+customerId);
System.out.println("\n");


System.out.println("A. Check Balance");

System.out.println("B. Deposit"); System.out.println("C. Withdraw");

System.out.println("D. Previous transaction");

System.out.println("E. Exit");

do

{

 System.out.println("Enter an option");
case 'C':

System.out.println("----"); 
System.out.println("Enter an amount to withdraw:");

System.out.println("---");

int amount2 =scanner.nextInt();

withdraw(amount2);

System.out.println("\n");

break;

case 'D':

System.out.println("-- ");

getPrevious Transaction();

System.out.println(" ");

System.out.println("\n");

break;

default:

System.out.println("Invalid Option!!.pase enter again"); break;

2

}

while(option); I

    

}
    }
