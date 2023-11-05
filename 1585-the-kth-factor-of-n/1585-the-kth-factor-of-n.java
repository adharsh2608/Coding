import java.util.Arrays;
class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                arr.add(i);
                
        }
        arr.add(n);
        if(k<=arr.size())
            return arr.get(k-1);
        else
        return -1;
    }
}