package lti.com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FinderEg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		FileInputStream fios=new FileInputStream("xyz.txt");
		DataInputStream dios=new DataInputStream(fios);
		String data;
		while((data=dios.readLine())!=null) {
			
			Matcher m=p.matcher(data);
			while(m.find()) {
				System.out.println(m.group());
			}	
		}
		

	}

}
