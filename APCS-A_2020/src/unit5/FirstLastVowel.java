package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{ a = a.toLowerCase();
	   if(a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o' || a.charAt(0) == 'u') {
		   return "yes";
	   } else if(a.charAt(a.length()-1) == 'a' || a.charAt(a.length()-1) == 'e' || a.charAt(a.length()-1) == 'i' || a.charAt(a.length()-1) == 'o' || a.charAt(a.length()-1) == 'u'){
		   return "yes";
	   }
	   return "no"; 
	}
}