import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().sort();
	}
    
    public void sort() throws IOException {
    	int N = Integer.parseInt(br.readLine());
    	int[][] arr = new int[N][2];
    	
    	for(int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		arr[i][0] = Integer.parseInt(st.nextToken());
    		arr[i][1] = Integer.parseInt(st.nextToken());
    	}
    	br.close();
    	
    	Arrays.sort(arr, new Comparator<int[]>() {
    		@Override
    		public int compare(int[] o1, int[] o2) {
    			if(o1[0] == o2[0]) {
    				return o1[1] - o2[1];
    			} else {
    				return o1[0] - o2[0];    				
    			}
    		}
		});
    	
    	for(int[] a : arr) {
    		for(int i : a) {
    			bw.write(i+" ");
    		}
    		bw.newLine();
    	}
    	bw.flush();
    	bw.close();
    	
    }

}