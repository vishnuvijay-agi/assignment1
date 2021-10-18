package regular.expressions;

import java.util.regex.*;

public class RegularExp{
	public static void main(String[]args) {
		String Regex="mo";
		String str="momo";
		Pattern p=new Pattern(Regex, 0);
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(true);
		}
		
	}
}