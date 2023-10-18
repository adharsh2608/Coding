class Solution {
    public boolean validMountainArray(int[] arr) {
    int a=arr.length;
		boolean flag=true;
		if (a <= 2 || a > Math.pow(10, 4)) {
			flag = false;
		} else if (arr[0] >= arr[1]) {
			flag = false;
		} else {
			int j = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] >= arr[i + 1]) {
					j = i;
					break;
				}
			}

			for (int i = j; i < arr.length - 1; i++) {
				if (arr[i] <= arr[i + 1]) {
					flag = false;
					break;
				}
			}

			
		}

		return flag;
    }
}