public class User{

	private String email;
	private String pass;
	private Person me;
	private Map<Countrie, LinkedList<Ticket>> tickets;

	public User(String email, String pass, String dni, String name, String surname, String celphone, String sex, Date birthDate) throws RuntimeException{
		if(checkEmail(email) && checkPass(pass)){
			this.me = new Person(dni, name, surname, celphone, sex, birthDate);
			this.email = email;
			this.pass = pass;
			this.tickets = new HashMap();
		}
	} 

	public String getEmail(){
		return email;
	}

	public Person getPerson(){
		return me;
	}

	public void addTicket(Ticket ticket){
		if(!tickets.containsKey(ticket.getCountrie())){
			List ticketsOfCountrie = new LinkedList<Ticket>();			//lo guardo asi para buscar rapido sobre un barrio
			tickets.put(ticket.getCountrie(), ticketsOfCountrie);
		}
		tickets.get(ticket.getCountrie()).add(ticket);
	}

	public List<Ticket> getTicketOf(Countrie countrie){
		return tickets.get(countrie);
	}
	
	public void actualizarTickets(){
																		//el usuario actualiza su lista ?
	}


}