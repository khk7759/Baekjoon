package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BaekJoon_11021
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = a+b;
			
			bw.write("Case #" + i + ": " + result + "\n");
			//System.out.println("Case #" + i + ": " + result);
		}
		
		br.close();

		bw.flush();
		bw.close();
	}

}
