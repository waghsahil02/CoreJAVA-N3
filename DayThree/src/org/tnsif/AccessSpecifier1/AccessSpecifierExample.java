package org.tnsif.AccessSpecifier1;

public class AccessSpecifierExample {

		//data members
		private String name;
		/* If any data member is is default */
		
		public void display() {
			System.out.println("The name is : "+name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
