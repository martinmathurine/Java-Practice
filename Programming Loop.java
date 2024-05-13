import javax.swing.JOptionPane;
class Ex6_1
{
public static void main(String args[])
  {
    int counter;
    counter = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));    
    
   
    while (counter >= 1) 
    {
    System.out.println ("I must practice programming");
    counter = counter - 1;
    }
    System.exit(0);
  }
}