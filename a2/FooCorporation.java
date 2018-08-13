public class FooCorporation{

  /**
  * printTotalPay() computes the pay an employee should recieve
  * @param double basePay for the employee
  * @param int hoursWorked to be paid to employee
  */
  public static void printTotalPay(double basePay, int hoursWorked){
    if(basePay < 8){
      System.out.println("error: employees must be paid over 8$ an hour.");
    }else if(hoursWorked > 60){
      System.out.println("error: employees must work less than 60 hours.");
    }else{
      double pay;
      if(hoursWorked > 40){
        pay = (40*basePay)+((hoursWorked-40)*(basePay*1.5));
      }else{
        pay = basePay*hoursWorked;
      }
      System.out.println("employee should be paid $"+pay);
    }
  }

  public static void main(String[] args){
    printTotalPay(7.5, 35);
    printTotalPay(8.2, 47);
    printTotalPay(10, 73);
  }
}
