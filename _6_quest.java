//Question: Implement a Calculator class with an add() method. Overload the add() method to handle different types of inputs: two integers, three integers, and two double values.



class Calculator
{
    int add(int x,int y)
    {
        int c=x+y;
        return c;
    }

    int add(int x,int y,int c)
    {
        int d=x+y+c;
        return d;
    }
    double add(double x,double y)
    {
        double z=x+y;
        return z;

    }
}
class main_6
{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
      System.out.println(cal.add(5,5));
      System.out.println(cal.add(5,5,5 ));
      System.out.println(cal.add(10.0 ,10.0));
    }
}