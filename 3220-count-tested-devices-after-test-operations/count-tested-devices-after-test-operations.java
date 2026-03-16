class Solution {
    public int countTestedDevices(int[] b) {
        //mylogic
        int c=0;
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                c++;
                for(int j=i+1;j<b.length;j++){
                    if(b[j]==0){
                        continue;
                    }
                    b[j]--;
                }
            }
        }
        return c;
        /*GPT logic
        int tested = 0;
        for(int b : batteryPercentages){
            if(b - tested > 0){
                tested++;
            }
        }
        return tested; 
        */
    }
}