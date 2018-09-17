import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
    final double KILOGRAMS_PER_POUND = 0.4535923;
    final double METERS_PER_INCH = 0.0254;
    //INCH PULGADAS

  System.out.println("enter weiht in pounds:");
  double weight = input.nextDouble();

  System.out.println("enter height in inches:");
    double height = input.nextDouble();
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightlntMeters = height * METERS_PER_INCH;
  //  double bmi = weightInKilograms / (heightlntMeters * heightlntMeters);
  double bmi = weightInKilograms / Math.pow (heightlntMeters , 2);
System.out.println("your are bmi is " + bmi);

if (bmi < 16)
System.out.println("your are seriously underweight");
else if (bmi < 18)
System.out.println("your are underweight");
else if ( bmi < 24)
System.out.println("your are normal weight");
else if ( bmi < 29)
System.out.println("your are overweight");
else if ( bmi < 35)
System.out.println("your are seriously overweight");
else
System.out.println("your are gravely overweight");

  }
}
