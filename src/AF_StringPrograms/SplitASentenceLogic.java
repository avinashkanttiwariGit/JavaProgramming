package AF_StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class SplitASentenceLogic 
{
	public static void main(String[] args) 
	{
		String str="mom son dad";
		StringBuilder sbuilder = new StringBuilder();
		List<String> strList = new ArrayList<String>();
		
		for(int i=0; i<str.length();i++)
		{
			if(!(str.charAt(i)==' ')) 
			{
				sbuilder.append(str.charAt(i));
				System.out.println(sbuilder);
			}
			else
			{
				strList.add(sbuilder.toString());
				sbuilder=new StringBuilder();
			}
		}
		strList.add(sbuilder.toString());
		System.out.println(strList);
	}
}