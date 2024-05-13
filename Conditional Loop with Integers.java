import javax.swing.JOptionPane;
class Ex6_7
{
public static void main (String args[])
  {            
	 int a=4;								//L1
	 int b;								//L2
     String str;							
     	
     str = JOptionPane.showInputDialog("Enter an integer:");
							
     b = Integer.parseInt(str);

	 while (a<=10)							//L3	
		{
		  if (a>b)
			 b=b*2;
		  else
			 b=a*3;

		  a = b+2;

          JOptionPane.showMessageDialog(null, "a, b: " + a + " " + b); 	//L4

          str = JOptionPane.showInputDialog("Enter another  integer:");
							
          b = Integer.parseInt(str);
		}
          JOptionPane.showMessageDialog(null, "a, b: " + a + " " + b); 	//L5

          System.exit( 0 );  // terminate the program

  }
}