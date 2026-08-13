class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maxpro=arr[0];
        int minpro=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            if(curr<0){
                int temp=maxpro;
                maxpro=minpro;
                minpro=temp;
            }
            maxpro=Math.max(curr,maxpro*curr);
            minpro=Math.min(curr,minpro*curr);
            ans=Math.max(ans,maxpro);
        }
        return ans;
    }
}