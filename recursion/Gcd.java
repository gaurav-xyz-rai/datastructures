package recursion;

public class Gcd
{
    public int gcd(int num1,int num2)
    {
        int gcd = 0;

        if (num2 == 0)
        {
            return num1;
        }
        return gcd(num2, num1%num2);
    }
}
