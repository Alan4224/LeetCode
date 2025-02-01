public class L58 {
    public static int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        return ss[ss.length - 1].length();
    }
}
