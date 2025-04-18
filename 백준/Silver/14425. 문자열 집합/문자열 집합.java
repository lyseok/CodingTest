import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().set();
	}
    
    public void set() throws IOException {
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int count = 0;
    	Set<String>set = new HashSet<String>();
    	
    	for(int i = 0; i < N; i++) {
    		set.add(br.readLine());
    	}
    	for(int i = 0; i < M; i++) {
    		if(set.contains(br.readLine())) count++;
    	}
    	
    	bw.write(String.valueOf(count));
    	bw.flush();
    	bw.close();

    }

}