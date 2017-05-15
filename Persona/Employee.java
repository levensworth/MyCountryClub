public class Employee extends Person{
	/*
	this class is intended for house cleaning services and landmowers
	maybe also pool cleaning services and anything that an owner can order but is periodically entering the establishment
	*/

	private String job;
	private Ticket idCard;

	private Schedule timeTable;

	public Employee(String dni, String name, String surname, String job ){
		super(dni,name,surname);

		checkJob(job);
		this.job = job;
	}

	public void SetIdCard(Schedule timeTable){
		idCard = new Ticket(this, timeTable);	
	}


	public void setTimeTable(Schedule timeTable){
		checkTimeTable(timeTable);
		timeTable = timeTable;
	}

	private void checkJob(String job){
		if(job == null){
			//for now we just leave it there but in a future it should verify with an external db 
			// for all possible values.
			throw new IllegalArgumentException("the job argument can't be empty");
		}
	}


	private void checkTimeTable(Schedule time){
		if(time == null || time.isEmpty() ){
			throw new IllegalArgumentException("the timeTable must have at least one day ");
		}
	}

	public String getJob(){
		return job;
	}

	public Stirng getIdCard(){
		return IdCard;
	}



}