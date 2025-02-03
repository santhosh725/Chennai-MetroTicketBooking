package Jdbc;

public class Passenger{

		
		private String name ;
		String orgin;
		String destination;
		String phoneNumber;
		Passenger(){
			super();
		}
		public String toString() {
			return "NAME : "+name+" | "+"ORGIN : "+orgin+" | "+"DESTINATION : "+destination;
		}
		Passenger(String name,String orgin,String destination,String phoneNumber){
			this.name = name;
			this.orgin = orgin;
			this.destination = destination;
			this.phoneNumber = phoneNumber;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		 public String getPhoneNumber() {
		        return phoneNumber;
		    }

		    public void setPhoneNumber(String phoneNumber) {
		        this.phoneNumber = phoneNumber;
		    }
	}



