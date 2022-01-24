class Sample3
{
	int k = 11;
	int g = 12;
	int f = 13;
}

class Sample4
{
	int a = 10;
	int b = 20;
	int c = 30;
}

class Sample5
{
	int x;
	int y;
	int z;
	
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		int l=0;
		int m=0;
		int o=0;
		
		l = new Sample3().k + new Sample4().a;
		m = new Sample3().g + new Sample4().b;
		o = new Sample3().f + new Sample4().c;
		
		System.out.println(l);
		System.out.println(m);
		System.out.println(o);
		
		new Sample5().x = l;
		new Sample5().y = m;
		new Sample5().z = o;
		
		System.out.println(new Sample5().x = l);
		System.out.println(new Sample5().y = m);
		System.out.println(new Sample5().z = o);
		
		System.out.println("Program Ended");
	}
	
}