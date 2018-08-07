package management_system;
import java.util.*;

public class Service {

	public static boolean addUser(boolean addUserFunction) {
		
		return addUserFunction;
		
	}	
	
	public static boolean retreiveUser(boolean retreiveUserFunction) {
		
		return retreiveUserFunction;
		
	}

	public static void main(String[] args) {
		
	ArrayList userList = new ArrayList();
	
	Account user1 = new Account("A", "B", "C");
	
	
	boolean addUserFunction;
	boolean retreiveUserFunction;
	
	
	if (addUserFunction == true) {
		
		userList.add(user1);
		
	}
	
	if (retreiveUserFunction == true) {
		
		userList.get(1);
		
	}
	
	}
	
			
}