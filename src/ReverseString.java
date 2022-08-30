import java.lang.*;
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "We123As1A1Team456Achieve789";

        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}