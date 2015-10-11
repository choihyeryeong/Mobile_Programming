package kc.ac.kookmin.exception.intro;

import java.io.*;

class AAA {

	public void readFile() 
	{
		File path1 = new File(".");
		String path = AAA.class.getResource("").getPath();
		
		System.out.println(path1.getAbsolutePath()); 
		BufferedReader inputStream = null;
		
	 try
	  {  
		 inputStream = 
				new BufferedReader(new FileReader(path+"a.txt"));
		 String str = null;
	         
	   while(true){
		   str = inputStream.readLine();
		   if(str == null) break;
		   System.out.println(str);
	     }
	   }
	 
	 catch(IOException e)//파일을 읽을 수 없음.
	   {
		 e.printStackTrace();  
	   }
	   
	 finally
	   {
		 close(inputStream);
	   }
		
	}
	
	public void close(BufferedReader inputStream){
		try
		{
			inputStream.close();
		}
		catch(IOException e){}
	}

}

public class Test {
		public static void main(String args[]) {
			AAA a = new AAA();
			a.readFile();
		}
	
}

