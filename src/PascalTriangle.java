public class PascalTriangle{
    public static void main(String args[]){
        int i,j,k;
        for (i=0;i<=4;i++){
            for(j=i;j<=4-1;j++) {
                System.out.print(" ");
            }
            int number=1;
            for (k=0;k<=i;k++) {
                System.out.print(" " + number + " ");
                number = number*(i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
