package recursion;

public class Power
{
  /***  public float power(int number,int power)
    {
        if (power == 0)
        {
            return 1;
        }
        if (power == 1)
        {
            return number;
        }
        if (power < 0)
        {
            power = Math.abs(power);
            return (1/(number * power(number,power-1)));
        }
        return (number * power(number,power-1));

    } ***/

    public double power(double x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        if (n == 1)
        {
            return x;
        }
        /***if (n < 0)
        {
            n = Math.abs(n);
            return (1/(x * power(x,n-1)));
        }***/
        return (x * power(x,n-1));
    }
}
