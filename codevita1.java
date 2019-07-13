import java.util.*;

public class Codevita1 {

	public static void main(String[] args) {
			
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> pairs = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0,l;
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		
		for(int i=0;i<n;i++) {
			int max=0,min=10,sum;
			int num = al.get(i);
			for(int j=0;j<3;j++) {
				l = num%10;
				num = num/10;
				if(l>max) {
					max = l;
				}
				if(l<min) {
					min = l;
				}
			}
			sum = min*7+max*11;
			if(sum>99) {
				sum = sum%100;
			}
			pairs.add(sum);
		}
		
		for(int i=0;i<n;i++) {
			int element = pairs.get(i);
			for(int k=i+1;k<n;k+=2) {
				if(element/10 == pairs.get(k)/10)
					count++;
			}
		}
		System.out.println(count);
	}

}
