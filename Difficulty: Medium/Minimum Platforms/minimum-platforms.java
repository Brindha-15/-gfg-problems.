class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int platforms=0;
        int maxplatforms=0;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                platforms++;
                maxplatforms=Math.max(maxplatforms,platforms);
                i++;
            }
            else{
                platforms--;
                j++;
            }
        }
        return maxplatforms;
    }
}
