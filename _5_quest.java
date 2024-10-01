//Question: Create a class Bank with a method getInterestRate(). Create subclasses SBI, HDFC, and ICICI that override the getInterestRate() method with their specific interest rates. Display the interest rates for different banks using polymorphism.

abstract class Bank{
    abstract double getInterestRate();
}


class SBI extends Bank
{
  double getInterestRate()
  {
    return 7.0;
  }
}

class HDFC extends Bank
{
      double getInterestRate()
      {
        return 6.50;
      }
}

class ICICI extends Bank
{
     double getInterestRate()
     {
        return 5.0;
     }
}


class main_5
{
    public static void main(String[] args) {
        SBI s=new SBI();
        System.out.println("interest rate of SBI is:"+s.getInterestRate());
        HDFC h=new HDFC();
        System.out.println("interest rate if HDFC is:"+h.getInterestRate());
        ICICI i=new ICICI();
        System.out.println("interest rate of ICICI is:"+i.getInterestRate());
    }
}

