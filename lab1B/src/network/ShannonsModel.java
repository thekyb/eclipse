/*
 *  @(#)ShannonsModel.java   1.0 YY/MM/DD
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

/**
 * descrived about the Shannon's theorem.
 * @author    Jean Ko
 * @version   1.1.0   2017. 2. 5.
 */
public class ShannonsModel	{

	/**
     * applicable wave frequency. 
     */
    private double bandwidth;
    /**
     * How much noise occurs in the signal
     */
    private double signalToNoise;

    /**
     * getter for bandwidth 
     * @return bandwidth : how much herz I can use as a signal
     */
    public double getBandwidth()
    {
        return bandwidth;
    }
    /**
     * getter for signalToNoise 
     * @return signalToNoise ;
     */
    public double getSignalToNoise()
    {
        return signalToNoise;
    }

	/**
     * Calculate and retern the value of the Maximum DataRate for the certain bandwidth and signalToNoise. 
	 * @param hertz  bandwidth
	 * @param signalToNoise  signal to Noise
	 * @return MaximumDataRate
	 * @throws NumberFormatException : When hertz or stn is less than 0, it will be regarded as a NumberFormatException. 
	 */
	private double getMaximumDataRate(double hertz, double signalToNoise) throws NumberFormatException{
		if (hertz < 0 || signalToNoise < 0)
		{
			throw new NumberFormatException();
		}
		return hertz * ( Math.log(1 + signalToNoise)/ Math.log(2));
	}
	/**
     * Calculate and retern the value of the Maximum DataRate using the own bandwidth and signalToNoise
	 * @return MaximumDataRate
	 * @throws Exception 
	 */
	public double getMaximumDataRate() throws NumberFormatException{
        return getMaximumDataRate(bandwidth, signalToNoise);
	}


    /**
	 *	Default constructor.
     *	the bandwidth and signalToNoise will be zero.
	 */
	public ShannonsModel(){
		this(0, 0);
	}
	/**
     * Parameterized constructor 
	 * @param h bandwidth
	 * @param snr signalToNoise  signalToNoise should not be smaller than 0. if then set the signalToNoise into 0. 
	 */
	public ShannonsModel(double h, double snr) throws NumberFormatException{
		if (h < 0 || snr < 0)
		{
			throw new NumberFormatException();
		}
		bandwidth = h;
		signalToNoise = snr;
	}

    /**
     * setter for Bandwidth
     * @param h bandwidth
     */
    public void setBandwidth(double h) throws NumberFormatException{
		if (h < 0)
		{
			throw new NumberFormatException();
		}
		bandwidth = h;
    }

    /**
     * setter for Signal to Noise
	 * @param snr signalToNoise  signalToNoise should not be smaller than 0. if then set the signalToNoise into 0. 
     */
    public void setSignalToNoise(double snr) throws NumberFormatException{
		if (snr < 0)
		{
			throw new NumberFormatException();
		}
        signalToNoise = snr;
    }

	/**
	 *	Convert this class to a meaningful string.
	 *	@return	This class as a meaningful string.
	 */
	 public String toString()	{
		 return	"Bandwidth : " + getBandwidth() + "\n" + "Signal to Noise : " + getSignalToNoise() + "\n" + "MaximumDataRate : " + getMaximumDataRate();
	}


}	/*	End of CLASS:	ShannonsModel.java			*/
