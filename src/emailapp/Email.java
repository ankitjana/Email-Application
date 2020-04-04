package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String Department;
	private String alternateEmail;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String email;
	private String company = "company";
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		this.Department = setDepartment();
		//System.out.println("Department: " + this.Department);
		

		
		this.email = constructEmail();
		//System.out.println("Email ID: " + this.email);
		
		this.password = setRandomPwd(defaultPasswordLength);
		//System.out.println("Password: "+ this.password);
		
	}
	
	//Ask for department
	private String setDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Department Code:\n 1.Sales\n 2.Dev\n 3.Accounting");
		int deptCode = sc.nextInt();
		if(deptCode==1) {return "sales";}
		else if(deptCode==2) {return "dev";}
		else if(deptCode==3) { return "acct";}
		else {return "";}
		
	}
	
	//Generate a Random Password
	
	private String setRandomPwd(int length) {
		String pwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&";
		char[] pwd= new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()*pwdSet.length());
			pwd[i]=pwdSet.charAt(rand);
		}
		return new String(pwd);
		
	}
	
	//Construct Email
	
	private String constructEmail() {
		String newEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + Department +  "." + company + ".com";
		return newEmail;
	}
	//Set the mailbox capacity
	void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	
	//Set the alternate email
	void setAlternateMail(String altmail) {
		this.alternateEmail = altmail;
	}
	//Change the password
	void changePassword(String newpwd) {
		this.password = newpwd;
	}
	
	//Get Methods
	int getMailboxCapacity() {return mailBoxCapacity;}
	String getAlternateEmail() {return alternateEmail;}
	String getPassword() {return password;}
	
	//Show Info
	String showInfo() {
		return "Name: " + firstName + lastName + "\n" + "Email: " + email + "\n" + "Mailbox Capacity: " + mailBoxCapacity + "mb\n" + "Alternate Email: " + alternateEmail + "\n";
	}
	
}
