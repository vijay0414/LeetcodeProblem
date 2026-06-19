class Solution {
    public double angleClock(int hour, int minutes) {
        double min = minutes * 6;
        double base = (hour * 30) + minutes * 0.5;
        double angle = Math.abs(min - base);

        return Math.min(angle ,360 - angle);
    }
}