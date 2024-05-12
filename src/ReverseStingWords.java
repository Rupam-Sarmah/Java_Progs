import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello World Java";
		ReverseStingWords solution = new ReverseStingWords();
        String reversedWords = solution.reverseWords(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed words: " + reversedWords);

	}
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        

        ArrayList<String> wordsArr=new ArrayList<>(Arrays.asList(words));
        System.out.println("wordArr--"+wordsArr);

        ArrayList<String> newWords= new ArrayList<>();

        for(int i=wordsArr.size()-1;i>=0;i--){
            newWords.add(wordsArr.get(i));
        }
        StringBuilder sb=new StringBuilder();

        for(String word : newWords){
            sb.append(word).append(" ");
        }
        System.out.println("StringBuilder--"+sb);

        String res=sb.toString().trim();
        return res;
    }

}
