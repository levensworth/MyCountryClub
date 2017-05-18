public abstract class Person {
	private String dni;
	private String name;
	private String surname;
	private String celphone;
	private String sex;
	private Date birthDate;

	protected Person(String dni, String name, String surname, String celphone, String sex, Date birthDate) throws RuntimeException{
		if(checkDni(dni) && checkName(name) && checkSurname(surname) && checkCelphone(celphone) && checkSex(sex) && checkBirthDate(birthDate)){
			this.dni = dni;
			this.name = name;
			this.surname = surname;
			this.celphone = celphone;
			this.sex = sex;
			this.birthDate = birthDate;
		}
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

	public String getCelphone(){
		return celphone;
	}

	public String getSex(){
		return sex;
	}

	public Date getBirthDate(){
		return birthDate;
	}

	public boolean equals(Object obj){
		if(obj == null || this.getClass() != obj.getClass()){
			return false;
		}

		Person aux = (Person) obj;
		return this.getDni() == aux.getDni();
	}

	private static boolean checkDni(String dni) throws InvalidDniException{
		if(dni != null && dni.matches("[-+]?\\d*\\.?\\d+")){
			return true;
		}
		return false;
	}
	private static boolean checkName(String name)throws InvalidNameException{
		if(name != null && name.matches("[a-zA-Z ]+"))
			return true;
		return false;
	}

	private static boolean checkSurname(String surname)throws InvalidSurnameException{
		if(surname != null && surname.matches("[a-zA-Z ]+"))
			return true;
		return false;
	}

	private static boolean checkCelphone(String celphone)throws InvalidCelphoneNumberException{
		if(celphone != null && ){
			return true;
		}
		return false;
	}

	private static boolean checkSex(String sex)throws InvalidSexException{
		if(sex != null && (sex.equals("Male") || sex.equals("Female"))){
			return true;
		}
		return false;
	}

	private static boolean checkBirthDate(Date birthDate)throws InvalidAgeException{
		if(birthDate != null && calculateAge(birthDate) >= 18 && calculateAge(birthDate) <= 100){
			return true;
		}
		return false;
	}

	private static int calculateAge(Date birthDate) {
    	long ageInMillis = new Date().getTime() - birthDate.getTime();
		Date age = new Date(ageInMillis);
		return age.getYear();
}

}