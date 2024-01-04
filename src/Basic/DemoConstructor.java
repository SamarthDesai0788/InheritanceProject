package Basic;

 class DemoConstructor {
        DemoConstructor(){
		System.out.println("I am constructor");
	}
	static{
		System.out.println("I am static method");
	}
	{
	System.out.println("I am non static method");
	}
	public static void main(String[] args) {
	System.out.println("I am Main Method");
	new DemoConstructor();
	}

}
