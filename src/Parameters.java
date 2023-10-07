public class Parameters {
	
	
	static String URL = "https://magento.softwaretestingboard.com/";
	
	static String[] firstNames = {"Raghad", "Farah", "Samar", "Leen","khaled","karam"};
	static String[] lastNames = {"Nedal", "Majed", "Ahmad", "Sameer"};
	
	
	static int firstIndex = (int)(Math.random() * firstNames.length); 
	static int lasttIndex = (int)(Math.random() * lastNames.length); 
	static int randomNumber = (int) (Math.random() * 9654589) + 1;
	
	static String firstName=firstNames[firstIndex];
	
	static String lastName=lastNames[lasttIndex];
	

	static String Email = firstName+lastName+randomNumber+"@gmail.com";

	static String Password = firstName+lastName+randomNumber+"@";
	static String registerMsg = "Thank you for registering with Main Website Store."; 
	static String welcomeMsg="Welcome, "+firstName+" "+lastName+"!";

}