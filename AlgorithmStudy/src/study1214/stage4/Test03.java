package study1214.stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buffw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(buffr.readLine());
		int T=N;
		int count=0;
		while(true) {	
			N = ((N%10)*10)+(((N/10)+(N%10))%10);
			count++;
			if(T==N)break;
		}
		buffw.write(count+"");
		buffw.flush();
		buffw.close();
	}
}
