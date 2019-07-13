import java.util.*;

public class Codevita2 {

	static ArrayList<Integer>bottle = new ArrayList<Integer>();
	static ArrayList<Integer>indicator = new ArrayList<Integer>();

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=0;i<n;i++) {
			bottle.add(sc.nextInt());
			indicator.add(0);
		}
		insert();
		for(int i=0;i<bottle.size();i++) {
				System.out.println(bottle.get(i)+"   "+indicator.get(i));
				count++;
		}
		System.out.println(count);
		
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<bottle.size()-1;) {
			if((bottle.get(i)<bottle.get(i+1)) && (indicator.get(i+1)==0)) {
				indicator.set(i+1, 1);
				indicator.remove(i);
				bottle.remove(i);
			}else {
				i++;
			}
		}
		for(int i=bottle.size()-1;i>0;i--) {
			if((bottle.get(i)<bottle.get(i-1)) && (indicator.get(i-1)==0)) {
				indicator.set(i-1, 1);
				indicator.remove(i);
				bottle.remove(i);
			}
		}
	}
}
