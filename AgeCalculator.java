
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator{
    private int currentYear = 2025;

    public int CanIdrive(int yearBirth){
    int age=currentYear-yearBirth;
    if (age>=16){
        System.out.println("congratulations! you are allowed to drive"); }
    else{  
     int yearsLeft =16-age;
     if (yearsLeft ==1){
     System.out.println("unfortunately, you can't drive yet, but in "+
     yearsLeft+" year you will be allowed to drive");}
     else {
      System.out.println("unfortunately, you can't drive yet, but in "+
     yearsLeft+" years you will be allowed to drive");
     }
    }
    return age;
}
  
}
