import java.util.Scanner;
class Geekyshows
{
    public static void main(String args[])
    {
        int num [][] = new int[3][4];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Value: ");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
               num [i][j] = obj.nextInt();
            }
        }
        System.out.println("You Entered: ");
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }
    }
}