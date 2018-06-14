package selectionsort;

import java.util.Scanner;

public class SELECTIONSORT {
	int n;
	int[] k;
	Scanner in;
	
	public SELECTIONSORT() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SELECTIONSORT select = new SELECTIONSORT();
		select.input();
		select.caculate();

	}
	
	public void input() {
		in = new Scanner(System.in);
		n = in.nextInt();
		k = new int[n];
		for(int i = 0; i < n; i++) {
			k[i] = in.nextInt();
		}
	}
	
	public void caculate() {
		for(int i = 0; i < n; i++) {
			int jmin = i;
			for(int j = i + 1; j < n; j++) {
				if(k[j] < k[jmin])
					jmin = j;					
			}
			if(jmin != i) {
				int tmp = k[jmin];
				k[jmin] = k[i];
				k[i] = tmp;
			}
				
		}
		for(int i = 0; i < n; i++) {
			System.out.println(k[i] + " ");
		}
	}

}
