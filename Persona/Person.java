public abstract class Person {
	private String dni;
	private String name;
	private String surname;

	protected Person(String dni, String name, String surname){
		if(checkDni(dni) && checkName(name) && checkSurname(surname)){
			this.dni = dni;
			this.name = name;
			this.surname = surname;

		}

	}

	private boolean checkDni(String dni){
		if(dni != null && dni.matches("[-+]?\\d*\\.?\\d+")){
			return true;
		}
		return false;
	}
	private boolean checkName(String name){
		if(name != null && name.matches("[a-zA-Z ]+"))
			return true;
		return false;
	}

	private boolean checkSurname(String surname){
		if(surname != null && surname.matches("[a-zA-Z ]+"))
			return true;
		return false;
	}


	public boolean equals(Object obj){
		if(obj == null || this.getClass() != obj.getClass()){
			return false;
		}

		Person aux = (Person) obj;
		return this.getDni() == aux.getDni();
	}


	public String getDni(){
		return dni;
	}
	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}
}