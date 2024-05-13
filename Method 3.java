class Ex2_4

{
	public static void main (String args[])
	{
	    firstMethod();// calling first method
        firstMethod();// calling first method (A 2ND TIME!!!)
		secondMethod();// calling second method
	}
	
	public static void firstMethod()//creating method
	{
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
	}
	
	public static void secondMethod()
	{
		System.out.println("    *    ");
		System.out.println("    *    ");
		System.out.println("*********");
		System.out.println(" ******* ");
		System.out.println("  *****  ");
	}
}