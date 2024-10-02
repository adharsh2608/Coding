class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String p=arr[0];
        for(int i=1;i<k;i++)
        {
            p=p+" "+arr[i];
        }
        return p;


    }
}