package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Dup {

	public static void main(String[] args) {
		String [] strArray = {"Java", "JSP", "Servlets", "JDBC", "JSP", "JDBC"};
		for(int i=0;i<strArray.length-1;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]))/* && (i!=j))*/
				{
					System.out.println("duplicate element is:"+strArray[i]);
				}
			}
		}
		
	}

}