import java.util.* ;
import java.io.*; 
public class specialPalindrome {

	public static boolean checkPalindrome(String str) {
		str= str.replaceAll("[^a-zA-Z0-9]","");
		int h  = str.length();
		str = str.toUpperCase();
		for(int i =0 ; i < str.length()/2;i++){
				if(str.charAt(i)!=str.charAt(h-i-1)){
					return false;
				}
		}
		return true;
	    
	 
	}
}