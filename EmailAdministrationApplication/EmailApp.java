package email_administration_application;

public class EmailApp {

	public static void main(String[] args) {

		Email email = new Email("John", "Smith");
		
		System.out.println(email.showInfo());
	}
}
