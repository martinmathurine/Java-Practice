import javax.swing.JOptionPane;
class Ex6_6
{
public static void main (String args[])
 {
  int mark;
  String str;

  str = JOptionPane.showInputDialog("First mark? \n (101 terminates): ");
							
     mark = Integer.parseInt(str);
  while (mark != 101)
    {
     if (mark >= 40)
        JOptionPane.showMessageDialog(null, "Passed");
     else 
        JOptionPane.showMessageDialog(null, "Failed");

     str = JOptionPane.showInputDialog("Next mark? \n (101 terminates): ");				
            mark = Integer.parseInt(str);
    }
    System.exit(0);  // terminate the program
 }
}
