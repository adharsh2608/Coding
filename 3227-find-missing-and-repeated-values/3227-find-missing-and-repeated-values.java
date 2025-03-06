class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        var list = new ArrayList<Integer>();
        var list1 = new ArrayList<Integer>();
        int[] ans = new int[2];
        for (int i = 1; i <= grid.length * grid.length; i++) 
        {
            list1.add(i);
        }
        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[i].length; j++) 
            {
                if (list.contains(grid[i][j])) 
                {
                    ans[0] = grid[i][j];
                } else
                 {
                    list.add(grid[i][j]);
                }
            }
        }
        for (int i = 0; i < grid.length; i++)
         {
            for (int j = 0; j < grid[i].length; j++) 
            {
                if (list1.contains(grid[i][j])) 
                {
                    list1.remove(Integer.valueOf(grid[i][j]));
                }
            }
        }
        if (!list1.isEmpty()) 
        {
            ans[1] = list1.get(0);
        }
        return ans;
    }
}