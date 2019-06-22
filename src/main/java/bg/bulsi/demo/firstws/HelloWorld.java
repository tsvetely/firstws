package bg.bulsi.demo.firstws;

import javax.inject.Named;

@Named
public class HelloWorld{

	  private String firstName = "TSVETA";
	  private String lastName = "GETOVA";

	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String showGreeting() {
	    return "Hello " + firstName + " " + lastName + "!";
	  }
}
