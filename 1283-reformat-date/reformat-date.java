class Solution {
    public String reformatDate(String date) {
        String[] s=date.split(" ");
        StringBuilder n=new StringBuilder();
        n.append(s[2]).append("-");
        n.append(month(s[1])).append("-");
        n.append(format(s[0]));
        return n.toString();
    }
    private String month(String m) {
        return switch (m) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> "";
        };
    }
    private String format(String d) {
        String num=d.replaceAll("[^0-9]", "");
        return num.length()==1?"0"+num:num;
    }

}