class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int n = arr.length;

        // Find first element greater than target
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }

        int lessOrEqual = left;

        // Find first element greater than or equal to target
        left = 0;
        right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }

        int greaterOrEqual = n - left;

        return new int[]{lessOrEqual, greaterOrEqual};
    }
}