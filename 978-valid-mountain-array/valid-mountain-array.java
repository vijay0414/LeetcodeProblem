class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean isvalid=false;
        int n=0;
        if(arr.length<=2) return false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                isvalid=true;
                n=i+1;
            }else{
                break;
            }
        }
        if(!isvalid || n==arr.length-1){{
            return false;
        }
        }
        for(int i=n;i<arr.length-1;i++){
            if(!(arr[i]>arr[i+1])){
                return false;
            }
        }
        return true;
    }
}