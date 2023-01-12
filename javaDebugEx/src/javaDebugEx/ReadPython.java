package javaDebugEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadPython {
public static void main(String[] args) throws IOException, InterruptedException {
//String path = "C:/Users/ADMIN/Desktop/hello/ccda_parse.py";
System.out.println("start the process");
ProcessBuilder pb = new ProcessBuilder("python","C:/Users/ADMIN/Desktop/hello/ccda_parse.py").inheritIO();
System.out.println("start the process 1");
Process p = pb.start();
System.out.println(" start the process 2 "+p.isAlive());
try {
	
	p.waitFor();
}catch (Exception e) {
	System.out.println(e);
	// TODO: handle exception
}

System.out.println(" start the process 4 ");
BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
System.out.println(" start process 3");
System.out.println(bfr.readLine());
String line = "";
while ((line = bfr.readLine()) != null) {
System.out.println(line);
}
}
}