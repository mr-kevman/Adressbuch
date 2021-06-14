package application;





public class Contact {

	

	String firstName;
	String secondName;
	String houseNumber;
	String postCode;
	String city;
	String country ;
	String phoneNumber;
	String emailadress;
	String userName;
		



	public 	Contact(String firstName,String secondName, String houseNumber, String postCode, String city, String country, String phoneNumber, String emailAdress,String userName){
		     this.firstName = firstName;
		     this.secondName = secondName;
		     this.houseNumber = houseNumber;
		     this.postCode = postCode;
		     this.city = city;
		     this.country = country;
		     this.phoneNumber = phoneNumber;
		     this.emailadress = emailAdress;
			 this.userName = userName;

	}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getSecondName() {
			return secondName;
		}


		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}


		public String getHouseNumber() {
			return houseNumber;
		}


		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}


		public String getPostCode() {
			return postCode;
		}


		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getEmailadress() {
			return emailadress;
		}


		public void setEmailadress(String emailadress) {
			this.emailadress = emailadress;
		}

		
		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}

	
	
}





