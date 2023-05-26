import java.util.*;
public class HashMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int M = sc.nextInt();
        int B[]= new int[M];
        for(int i=0;i<M;i++)
        {
            B[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }
            else {
                hm.put(A[i],1);
            }
        }
        int ans[]= new int[M];
        for(int i=0;i<M;i++)
        {
            if(hm.containsKey(B[i]))
            {
                ans[i] = hm.get(B[i]);
            }
            else
            {
                ans[i]=0;
            }
        }
        for(int i=0;i<M;i++)
        {
            System.out.println(ans[i]);
        }





    }
}
