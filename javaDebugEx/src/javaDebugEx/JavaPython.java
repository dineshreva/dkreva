package javaDebugEx;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaPython {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = null;
		Process p = Runtime.getRuntime().exec("python C:/Users/ADMIN/Desktop/hello/sample.py");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		//System.out.println("Hello "+br.readLine().length());
		while((s = br.readLine())!= null){
			System.out.println(s);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
