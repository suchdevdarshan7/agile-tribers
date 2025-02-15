public class solution7 {
    public static char findTheDifference(String s, String t) {
        int charSumS = 0, charSumT = 0;
        
        for (char c : s.toCharArray()) {
            charSumS += c;
        }
        
        for (char c : t.toCharArray()) {
            charSumT += c;
        }
        
        return (char) (charSumT - charSumS);
    }
    
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
