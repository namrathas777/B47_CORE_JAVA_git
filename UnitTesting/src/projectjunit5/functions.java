package projectjunit5;

class functions {
	public static int armstrong (int n) {
		int t,r,res=0;
		t=n;
		while(t!=0) {
			r=t%10;
			res += Math.pow(r,3);
			t=t/10;
		}
		if(res==n)
			return n++;
		else
			return n--;
	}

}
