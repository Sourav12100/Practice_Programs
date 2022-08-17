public class SwapTwoNoWithoutThirdV
{
    public static void main (String args [])
    {
        int a=15 , b=25;
        System.out.println("Before swapping values are:"+a+" "+b);
        a=a+b;
        b=a-b;
        a=b-a;
        System.out.println("After swapping");
    }
}
