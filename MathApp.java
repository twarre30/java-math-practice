public class MathApp {
  public static void main(String[] args) {
    double job1Salary = 44808.50;
    double job2Salary = 55800.10;
    double max = Math.max(job1Salary, job2Salary);
    System.out.println(max);

    double carPrice = 10000.00;
    double truckPrice = 25000.00;
    double min = Math.max(carPrice, truckPrice);
    System.out.println(min);

    double radius = 7.25;
    double areaOfCircle = Math.PI * radius * radius;
    System.out.println(areaOfCircle);
    
    float num1 = 5.0f;
    double squareRoot = Math.sqrt(num1);
    System.out.println(squareRoot);

    System.out.println(Math.sqrt(((5 * 10) + (85 * 50))));

    float num2 = -3.8f;
    float positiveValue = Math.abs(num2);
    System.out.println(positiveValue);

    System.out.println(Math.random());



  }
}
