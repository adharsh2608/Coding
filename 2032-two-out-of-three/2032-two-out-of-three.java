class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Solution s=new Solution();
        List<Integer> a=new ArrayList<Integer>();
        List<Integer> b=new ArrayList<Integer>();
        List<Integer> c=new ArrayList<Integer>();
        List<Integer> d=new ArrayList<Integer>();
        for(int i:nums1)
        {
            if(a.contains(i))
            {
                
            }
            if(!a.contains(i))
            {
                a.add(i);
            }
            
            
        }
        for(int j:nums2)
        {
            if(a.contains(j)&&!b.contains(j)&&!c.contains(j))
            {
                b.add(j);
            }
            else if(!a.contains(j))
            {
                a.add(j);
                c.add(j);
            }
        }
        for(int k:nums3)
        {
            if(a.contains(k)&&!b.contains(k)&&!d.contains(k))
            {
                b.add(k);
            }
            else if(!a.contains(k))
            {
                a.add(k);
                d.add(k);
            }
        }
        return b;
    }
} 
