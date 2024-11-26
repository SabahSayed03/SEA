package Fest;

//Date: 26/11/2024
//Title: The give case study implements OOC principles 
//Hackafest Class
//This Class Inherits form the Events Class
public class Hackafest extends Events {
	private String EventName;
	private String EventInfo;
	private String HackSchedule;

	public Hackafest( String EventName,String EventInfo, String HackSchedule) {
		super(EventName,EventInfo);
		this.HackSchedule;
		
		public setHackSchedule() {
			this.HackSchedule=HackSchedule;
		}
		
		public String getHackSchedule() {
			return HackSchedule;
		}
	}

}
