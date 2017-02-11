/*
 *  @(#)ShannonsTheorem.java   1.0 YY/MM/DD
 *
 *
 *  This software contains confidential and proprietary information
 *  of Dyer Consulting ("Confidential Information").  You shall not disclose
 *  such Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with Dyer Consulting.
 *
 *  This software is provided "AS IS,".  No warrantee of any kind, express
 *  or implied, is included with this software; use at your own risk, responsibility
 *  for damages (if any) to anyone resulting from the use of this software rests
 *  entirely with the user even if Dyer Consulting has been advised of the
 *  possibility of such damages.
 *
 *  This software is not designed or intended for use in on-line control of
 *  aircraft, air traffic, aircraft navigation or aircraft communications; or in
 *  the design, construction, operation or maintenance of any nuclear
 *  facility. Licensee represents and warrants that it will not use or
 *  redistribute the Software for such purposes.
 *
 *  Distribute freely, except: don't remove my name from the source or
 *  documentation, mark your changes (don't blame me for your possible bugs),
 *  don't alter or remove any of this notice.
 */


package network;													/*	Package for class placement	*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * descrived about the Shannon's theorem.
 * @author    Jean Ko
 * @version   1.1.0   2017. 2. 5.
 */
public class ShannonsTheorem	{

    /**
     * model in MVC pattern for ShannonsTheorem
     */
    private ShannonsModel model;

	/**
	 *	Default constructor.
     *	the bandwidth and signalToNoise will be zero.
	 */
	public ShannonsTheorem(){
		model = new ShannonsModel(0, 0);
	}
	/**
     * Parameterized constructor 
	 * @param h bandwidth : how much herz I can use as a signal
	 * @param snr signalToNoise  signalToNoise should not be smaller than 0. if then set the signalToNoise into 0. 
	 */
	public ShannonsTheorem(double h, double snr){
		model = new ShannonsModel(h, snr);
	}

    /**
     * getter for bandwidth 
     * @return bandwidth : how much herz I can use as a signal
     */
    public double getBandwidth()
    {
        return model.getBandwidth();
    }
    /**
     * getter for signalToNoise 
     * @return signalToNoise : how much ratio can be delivered from the Noise
     */
    public double getSignalToNoise()
    {
        return model.getSignalToNoise();
    }

    /**
     * setter for Bandwidth
	 * @param h bandwidth : how much herz I can use as a signal
     */
    public void setBandwidth(double h) {
        model.setBandwidth(h);
    }

    /**
     * setter for Signal to Noise
	 * @param snr signalToNoise  signalToNoise should not be smaller than 0. if then set the signalToNoise into 0. 
     */
    public void setSignalToNoise(double snr) {
		model.setSignalToNoise(snr);
    }

	/**
     * Calculate and retern the value of the Maximum DataRate using the own bandwidth and signalToNoise
	 * @return MaximumDataRate
	 * @throws Exception 
	 */
	public double getMaximumDataRate() throws Exception{
        return model.getMaximumDataRate();
	}

	/**
	 *	Convert this class to a meaningful string.
	 *	@return	This class as a meaningful string.
	 */
	 public String toString()	{
		 return	model.toString();
	}

    /**
	 * Entry point "main()" as required by the JVM.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		ShannonsTheorem app = new ShannonsTheorem();

		JFrame frame = new JFrame("InputDialog Example #1");
		
		while (true)
		{
			try
			{
				String[] options = {"OK"};
				JPanel panel = new JPanel();
				JLabel lbl = new JLabel("Hertz: ");
				JTextField txt = new JTextField(15);
				panel.add(lbl);
				panel.add(txt);
				JOptionPane.showOptionDialog(null, panel, "Get Information", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
				
				app.setBandwidth(Double.parseDouble(txt.getText()));
				
				JPanel panel2 = new JPanel();
				JLabel lbl2 = new JLabel("Signal to noize");
				JTextField txt2 = new JTextField(15);
				panel2.add(lbl2);
				panel2.add(txt2);
				JOptionPane.showOptionDialog(null, panel2, "Get Information", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);

				app.setSignalToNoise(Double.parseDouble(txt2.getText()));

				JOptionPane.showMessageDialog(frame, app.toString());
			}
			catch(Exception e)
			{
				String[] options = {"OK"};
				JPanel panel = new JPanel();
				JLabel lbl = new JLabel("You put Wrong Number. Will you try it again? If you want to stop, please input \"N\".");
				JTextField txt = new JTextField(15);
				panel.add(lbl);
				panel.add(txt);
				JOptionPane.showOptionDialog(null, panel, "Get Information", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);

				if (txt.getText().compareTo("N") == 0 || txt.getText().compareTo("n") == 0){
					break;
				}
			}

			String[] options = {"OK"};
			JPanel panel = new JPanel();
			JLabel lbl = new JLabel("Will you try it again? If you want to stop, please input \"N\".");
			JTextField txt = new JTextField(15);
			panel.add(lbl);
			panel.add(txt);
			JOptionPane.showOptionDialog(null, panel, "Get Information", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);

			if (txt.getText().compareTo("N") == 0 || txt.getText().compareTo("n") == 0){
				break;
			}
        }
	}	/*	End of CLASS:	ShannonsTheorem.java			*/
}
