package symphony;

import java.util.ArrayList;

public class Orchestra {
    private String name;
    private ArrayList<Musician> musicianList;
    private int numberofMember;
    private Payment payment;
    
    public Orchestra(String name, ArrayList<Musician> musi, int numb, Payment pa)
    {
    	this.name = name;
    	this.musicianList = musi;
    	this.numberofMember = numb;
    	this.payment = pa;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Musician> getMusicianList() {
		return musicianList;
	}
	public void setMusicianList(ArrayList<Musician> musicianList) {
		this.musicianList = musicianList;
	}
	public int getNumberofMember() {
		return numberofMember;
	}
	public void setNumberofMember(int numberofMember) {
		this.numberofMember = numberofMember;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}


}
