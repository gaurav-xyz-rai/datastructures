package recursion;

public class Power
{
    public float power(int number,int power)
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

    }
}
