package Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class ImmutableEmployee {
	
public ImmutableEmployee(String firstName, String lastName, List<String> previousNames) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.previousNames = previousNames;
	}
private  String firstName;
private  String lastName;
private  final List<String> previousNames;

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public List<String> getPreviousNames() {
	List<String> copied = new ArrayList<>(previousNames);
	Collections.copy(copied, previousNames);
	return copied;
}
@Override
public String toString() {
	return "ImmutableEmployee [firstName=" + firstName + ", lastName=" + lastName + ", previousNames=" + previousNames
			+ "]";
}


}
