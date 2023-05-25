import java.util.*;
public class MatrixRotation90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        int ans[][]=new int[M][N];
        /**Transpose the Matrix and then reverse the rows of the matrix to get the required matrix*/
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                ans[j][i]=A[i][j];
            }
        }
        for(int i=0;i<N;i++)
        {
            int a=0;
            int b=M-1;
            while(a<b)
                {
                    int temp=ans[i][a];
                    ans[i][a]=ans[i][b];
                    ans[i][b]=temp;
                    a++;
                    b--;
                }
            }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        }
    }

