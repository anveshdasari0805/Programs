import java.util.*;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int M1[][] = new int[R1][C1];
        for(int i=0;i<R1;i++)
        {
            for(int j=0;j<C1;j++)
            {
                M1[i][j]=sc.nextInt();
            }
        }
        int M2[][] = new int[R1][C1];
        for(int i=0;i<C1;i++)
        {
            for(int j=0;j<R1;j++)
            {
                M2[i][j]=M1[j][i];
            }
        }
        for(int i=0;i<C1;i++)
        {
            for(int j=0;j<R1;j++)
            {
                System.out.print(M2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
