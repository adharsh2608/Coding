import java.util.*;
class Solution {
    public double myPow(double x, int n) {
        if(x<=-100.0 || x>=100.0)
        {
            System.exit(0);
        }
        else if (n<Math.pow(-2,31)||n>Math.pow(2,31)-1)
        {
            System.exit(0);
        }
        double ans=(double)Math.pow(x,n);
        return ans;
    }
}