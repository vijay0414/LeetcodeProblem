class Solution {
    public int finalPositionOfSnake(int n, List<String> cmd) {
        int i=0,j=0,k=0;
        while(k<cmd.size()){
            String c=cmd.get(k);
            if(c.equals("RIGHT")) j++;
            else if(c.equals("LEFT")) j--;
            else if(c.equals("DOWN")) i++;
            else if(c.equals("UP")) i--;

            k++;
        }
        return (i*n)+j;
    }
}