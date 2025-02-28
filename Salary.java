
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    
public void getNetPay(double hours,double hourlyWage){
   double salary = hours*hourlyWage;
   double taxes=0.3;
   double netPay=salary-(salary*0.3);
   System.out.println("your netpay is: "+netPay);
}

}
