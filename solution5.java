public class solution5 {
    public static int findLongestWordLength(String sentence) {
        String[] words = sentence.split(" ");
        int maxLength = 0;
        
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog";
        int ans = findLongestWordLength(sentence);
        System.out.println(ans);
    }
}
