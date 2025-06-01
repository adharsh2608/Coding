class Solution {
    public long distributeCandies(int n, int limit) {
        
        java.util.function.LongUnaryOperator comb2 = x -> x >= 0 ? x * (x - 1) / 2 : 0;
        
        
        return comb2.applyAsLong(n + 2)
             - 3 * comb2.applyAsLong(n - limit - 1 + 2)
             + 3 * comb2.applyAsLong(n - 2 * (limit + 1) + 2)
             - comb2.applyAsLong(n - 3 * (limit + 1) + 2);
    }
}