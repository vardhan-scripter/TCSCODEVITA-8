import java.util.*;

public class Codechef {

	public static void main(String[] args) {	
		ArrayList<String> Strings = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int k = 0;
		String l="" ,s = "";
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				s = s.concat("**");
			}
			for(int j=i;j<n;j++) {
				k=k+10;
				s = s.concat(String.valueOf(k));
			}
			Strings.add(s);
			s="";
		}
		
		for(int i=n-1;i>=0;i--) {
			s = Strings.get(i);
			for(int j=i;j<n;j++) {
				k=k+10;
				if(j==n-1) {
					l=l.concat(String.valueOf(k/10));
				}else {
					l=l.concat(String.valueOf(k));
				}
			}
			s = s.concat(l);
			Strings.set(i, s);
			s="";
			if(n%2==0)
				l="0";
			else
				l="";
			
		}
		
		for(int i=0;i<n;i++) {
			
			System.out.println(Strings.get(i));
		}
	}
}
