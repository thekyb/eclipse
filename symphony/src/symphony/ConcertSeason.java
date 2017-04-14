package symphony;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class ConcertSeason {
	public enum Season {
	    WINTER, SPRING, SUMMER, FALL
	}

	private int mYear;
    private Season mSeason;
    private ArrayList<ScheduledConcert> mConsertList;


	public ConcertSeason(int year, Season season){
        mYear = year;
        mSeason = season; 
    }
	public ConcertSeason(){
		this(0, Season.WINTER);
		
		Date today = new Date();
		switch(LocalDate.now().getMonthValue())
		{
		case 1: 
		case 2: 
		case 3: 
            mSeason = Season.WINTER;
            break;
		case 4: 
		case 5: 
		case 6: 
            mSeason = Season.SPRING;
            break;
		case 7: 
		case 8: 
		case 9: 
            mSeason = Season.SUMMER;
            break;
		case 10: 
		case 11: 
		case 12: 
            mSeason = Season.FALL;
            break;
		}
    }
	
	public int getmYear() {
		return mYear;
	}
	public void setmYear(int mYear) {
		this.mYear = mYear;
	}
	public Season getmSeason() {
		return mSeason;
	}
	public void setmSeason(Season mSeason) {
		this.mSeason = mSeason;
	}


    public void addConcert(ScheduledConcert concert){
    	mConsertList.add(concert);
    }

    public void disableConcert(int id){
    	for(Concert m : mConsertList)
    	{
    		if (m.getId() == id)
    			m.enable(false);
    	}
    }
    public void enableConcert(int id){
    	for(Concert m : mConsertList)
    	{
    		if (m.getId() == id)
    			m.enable(true);
    	}
    }

    //TODO this is for the display and will be prepared again 
//    public void getConcertInfo(int ID){
//    	
//    }

    public Date checkOpeningDate(){
        Date Opening = null;  
    	for(ScheduledConcert m : mConsertList)
    	{
            if (Opening == null || Opening.after(m.getDateList().get(0)))            
                Opening = m.getDateList().get(0);
    	}
        return Opening;
    }

    public Date checkCloseDate(){
        Date closeDate = null;  
    	for(ScheduledConcert m : mConsertList)
    	{
            if (closeDate == null || closeDate.before(m.getDateList().get(m.getDateList().size()-1)))           
                closeDate = m.getDateList().get(m.getDateList().size()-1);
    	}
        return closeDate;

    }

}
