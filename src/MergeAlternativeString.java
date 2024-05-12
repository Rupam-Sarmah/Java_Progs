


public class MergeAlternativeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result= merge("Rupam","Sarmah");
		System.out.println(result);

	}
	public static String merge(String w1,String w2) {
		StringBuilder res= new StringBuilder();
		int maxLen=Math.max(w1.length(), w2.length());
		for(int i=0;i<maxLen;i++) {
			if(i<w1.length())res.append(w1.charAt(i));
			if(i<w2.length())res.append(w2.charAt(i));
		}		
		return res.toString();
		
	}

}
