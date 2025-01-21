class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int cmax=0;
        int l=0;
        int r=heights.length-1;
        while(l<r)
        {
            if(heights[l]<=heights[r])
            {
                    cmax=heights[l]*(r-l);
                    l++;
            }
            else if(heights[l]>=heights[r])
            {
                    cmax=heights[r]*(r-l);
                    r--;
            }
            else
            {
                r--;
            }
            if(cmax>max)
            {
                max=cmax;

            }
        }
        return max;
    }
}
