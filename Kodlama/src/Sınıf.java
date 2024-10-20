import java.util.*;
import java.lang.*;
import java.math.*;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;


 class  Sınıf {
	 private static Scanner tara;
	private static void ispolindrom(String s1) {
		String s2=terscevir(s1);
		if(s2.equals(s1)==true)
			out.println("polindrom");
			else
				out.println("değil");
	}
	 public static String terscevir(String s) {
	 StringBuilder str=new StringBuilder(s);
	 return str.reverse().toString();
	 }
    public static void main(String[] args) {
    	
    	tara=new Scanner(System.in);
    	out.println("cümle girin;");
    	String girilen=tara.next();
    	out.println(girilen+" polindrom mu?");
    	ispolindrom(girilen);
    }
}
