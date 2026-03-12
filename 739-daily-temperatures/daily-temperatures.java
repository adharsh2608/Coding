class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output=new int[temperatures.length];
        Stack<int[]> arr=new Stack<int[]>();
        Arrays.fill(output,0);
        for(int i=0;i<temperatures.length;i++)
        {
            int t=temperatures[i];
            while(!arr.isEmpty() && t>arr.peek()[0])
            {
                int[] pair=arr.pop();
                output[pair[1]]=i-pair[1];
            }
            arr.push(new int[]{t,i});
        } 
        return output;
    }
}