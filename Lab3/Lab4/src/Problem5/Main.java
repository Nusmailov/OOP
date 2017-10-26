package Problem5;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int n = sc.nextInt();
		for(int i = 0; i < n;i++) {
			a[i] = sc.nextInt();
		}
		MinMax m = new MinMax();
		MinMax.Pair p = m.MinMax(a);
		
		System.out.println(m);
		sc.close();	
	}
}

