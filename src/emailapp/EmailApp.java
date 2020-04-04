package emailapp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name: ");
		String fullname = sc.nextLine();
		String[] splited = fullname.split("\\s+");
		if(splited.length !=2) {
			System.out.println("Wrong Format");
			System.exit(0);
		}
		Email em1 = new Email(splited[0],splited[1]);
		System.out.println(em1.showInfo());
		int op = 0;
		while(op!=6) {
			System.out.println("Choose Options : \n" + "1. Change Email ID\n" + "2. Show Password\n" + "3. Change Password\n" + "4. Change Mailbox capacity\n" + "5. Show Information again\n" + "6. Exit");
			op = Integer.parseInt(sc.nextLine());
			if(op==1) {
				System.out.println("Enter Alternate Email ID");
				String newEmailID = sc.nextLine();
				em1.setAlternateMail(newEmailID);
			}
			else if(op==2) {
				System.out.println("Password: " + em1.getPassword());
			}
			else if(op==3) {
				System.out.println("Enter New Password");
				String newPwd = sc.nextLine();
				em1.changePassword(newPwd);
			}
			else if(op==4) {
				System.out.println("Enter New Mailbox Capacity");
				int newCap = Integer.parseInt(sc.nextLine());
				em1.setMailboxCapacity(newCap);
			}
			else if(op==5) {
				System.out.println(em1.showInfo());
			}
			else if(op==6) {
				System.exit(0);
				
			}
			else {
				System.out.println("Enter Correct Option");
			}
				
			}
	}
}
