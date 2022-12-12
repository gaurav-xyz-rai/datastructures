package recursion;
public class DecimalToBinary
{
    public int decimalToBinary(int decimalNumber)
    {
        if (decimalNumber == 0)
        {
            return 0;
        }
        return (decimalNumber%2 + 10*decimalToBinary(decimalNumber/2));
    }
}
