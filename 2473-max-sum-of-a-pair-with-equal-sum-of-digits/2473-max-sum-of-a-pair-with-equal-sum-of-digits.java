class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = getDigitSum(num);
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }
        return maxSum;
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


//         Arrays.sort(nums);
//         int sum=0;
//         int msum=0;
//         HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();

//         for(int i=0;i<nums.length;i++)
//         {
//             int digits=digitsum(nums[i])
//             if(map.containsKey(digits))
//             {
//                 map.get(digits).add(nums[i]);
//             }
//             else
//             {
//                 map.put(digits,new ArrayList<>().add(nums[i]));
//             }
//         }
//         if(msum==0)
//             return -1;
//         return msum;
//     }
//     public int digitsum(int sum)
//     {
//         int total=0;
//         while(sum!=0)
//         {
//             int rem=sum%10;
//             total+=rem*10;
//             sum=sum/10;
//         }
//         return total;
//     }
// }
