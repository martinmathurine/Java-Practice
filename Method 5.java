class Ex2_6

{
	public static void main (String args[])
	{
	    firstMethod();
		System.out.println();//executes an empty line
		secondMethod();
		System.out.println();
		firstMethod();//executes 'firstMethod' again
        firstMethod();//executes 'firstMethod' again
		secondMethod();//executes 'secondMethod' again
	}
	
	public static void firstMethod()
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