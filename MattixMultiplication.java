import java.util.*;
public class MattixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
        int M1[][] = new int[R1][C1];
        int M2[][] = new int[R2][C2];
        for(int i=0;i<R1;i++)
        {
            for(int j=0;j<C1;j++)
            {
                M1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<R2;i++)
        {
            for(int j=0;j<C2;j++)
            {
                M2[i][j]=sc.nextInt();
            }
        }
        int M3[][] = new int[R1][C2];
        if(C1==R2)
        {
            int i,j,k;
            for(i=0;i<R1;i++)
            {
                for(j=0;j<C2;j++)
                {
                    M3[i][j]=0;
                    for(k=0;k<R2;k++)
                    {
                        M3[i][j]+=M1[i][k]*M2[k][j];
                    }
                }
            }

        }
        for(int i=0;i<R1;i++)
        {
            for(int j=0;j<C2;j++)
            {
                System.out.print(M3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
