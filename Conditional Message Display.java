import javax.swing.JOptionPane;
class Ex5_4
{
public static void main(String args[])
  {
    int x =2;					//L1
    int y =3;					//L2
    if (x==2)					//L3
       if (y==1)					//L4
 		JOptionPane.showMessageDialog(null,"FIRST");
       else JOptionPane.showMessageDialog(null,"FINAL");
    else JOptionPane.showMessageDialog(null,"SING");

    JOptionPane.showMessageDialog(null,"SONG");

    
    x =2;					//L5
    y =1;					//L6

    if (x==2)					//L7
      if (y==1)					//L8
        	JOptionPane.showMessageDialog(null,"FIRST");
      else JOptionPane.showMessageDialog(null,"FINAL");
    else JOptionPane.showMessageDialog(null,"SING");

   JOptionPane.showMessageDialog(null,"SONG");

    x =1;					//L9
    y =3;					//L10

    if (x==2)					//L11
      if (y==1)					//L12
 	   JOptionPane.showMessageDialog(null,"FIRST");
      else JOptionPane.showMessageDialog(null,"FINAL");
    else JOptionPane.showMessageDialog(null,"SING");

  JOptionPane.showMessageDialog(null,"SONG");
    System.exit(0);
  }
}
