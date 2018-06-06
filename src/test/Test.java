package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Test {
	public static void main(String[] args) throws ParseException
    {
		
		String s= "2018-03-22T11:50";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		Date date = simpleDateFormat.parse(s);
		System.out.println(date);
    }
}


