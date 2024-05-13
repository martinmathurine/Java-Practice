import javax.swing.JOptionPane;
class Ex5_2
{
	public static void main (String[] args)
	{
		int milesorkm = Integer.parseInt(JOptionPane.showInputDialog("Convert: 1=Miles->Km / 2=Km->Miles / 3=Exit"));
		
		if (milesorkm == 1){
		String miles = JOptionPane.showInputDialog("Enter Mile(s): ");	
		double M = Double.parseDouble(miles);
		double Mtokm = M * 1.61;
        System.out.println(Mtokm );
		}

	    else if (milesorkm == 2) {
		String kilom = JOptionPane.showInputDialog("Km: ");	
		double km = Double.parseDouble(kilom);
		double kmtom = km / 1.61;
		System.out.println(kmtom);
	    }
	    

	
	
	
	
	
	
	    
		System.exit(0);
	}
}