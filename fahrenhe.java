import java.util.Scanner;
public class fahrenhe {
public static void main (String[] args){
 Scanner scanner = new Scanner(System.in);
 int mySalary = 2000;
 System.out.println("Enter Fagrenheit degree: ");
 float fahrengeit = scanner.nextFloat();
 float celsius = (fahrengeit- 32) * 5/9;
 double roundedCel = Math.round(celsius*100.0)/100.0; 
 System.out.println(fahrengeit + "Fah is equal to " + roundedCel + "celsius.");
 scanner.close();
} 
}

    
