import java.util.*;
public class HashMapUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }
            else
            {
                hm.put(A[i],1);
            }
        }
        System.out.println(hm);
        int count=0;
        for(Integer i:hm.values())
        {
            if(i==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
