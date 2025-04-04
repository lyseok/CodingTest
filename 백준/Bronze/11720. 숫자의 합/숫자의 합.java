import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        
        st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        
        int[] arr = new int[input.length()];
        
        for(int i = 0; i < input.length(); i++) {
        	arr[i] = Character.getNumericValue(input.charAt(i));
        }
        int sum = 0;
        for(int i : arr) {
        	sum += i;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        
	}

}