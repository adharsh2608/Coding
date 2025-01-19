class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> check=new HashSet<Character>();
        Set<Character> checkver=new HashSet<Character>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
            if(i%3==0 && j%3==0)
            {
                boolean ans=subboxcheck(board, i ,j);
                if(!ans)
                    return false;
            }
             char element=board[i][j];
             char element2=board[j][i];
             if(check.contains(element)&& element!='.')
                return false;
             else
                check.add(element);    
            if(checkver.contains(element2)&& element2!='.')
                return false;
            else
                checkver.add(element2);
            }
            check.clear();
            checkver.clear();
       }

       System.out.print(check.toString());
       return true;
    }
    public boolean subboxcheck(char[][] board,int i ,int j)
    {
        Set<Character> checking= new HashSet<Character>();
        for(int k=0;k<3;k++)
        {
            for(int l=0;l<3;l++)
            {
                char element=board[i+k][j+l];
                if(checking.contains(element)&& element!='.')
                    return false;
                else
                    checking.add(element);
            }
        }
        return true;
    }
}
