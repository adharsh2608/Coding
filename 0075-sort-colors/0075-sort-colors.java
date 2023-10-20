class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        String a="";
        String b="";
        String c="";
        for(int i=0;i<len;i++)
        {
            if(nums[i]==0)
                a=nums[i]+" "+a;
            else if(nums[i]==1)
                b=nums[i]+" "+b;
            else if(nums[i]==2)
                c=nums[i]+" "+c;
        }
        String d=a+b+c;
        String[] string = d.split(" ");
        
        for (int i = 0; i<string.length;i++) {
            nums[i] = Integer.valueOf(string[i]);
        }
        
        System.out.println("["+d+"]");
        
    }
}