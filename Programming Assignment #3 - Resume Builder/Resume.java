import javax.sound.sampled.Line;

public class ResumeBuilder {

	public static void main(String[] args) {
			Scanner = new Scanner(System.in);
			String name = getName(scanner); 
			String contactInformation = getContactInfo(scanner);
			String education = getEducation(scanner);
			String workExperience = getWorkExperience(scanner);
			String skills = getSkills(scanner);
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("Resume for " + name);
			System.out.println("");
			System.out.println("Contact Information: \n" + contactInformation);
			System.out.println("");
			System.out.println("Education:\n" + sectionEducation);
			System.out.println("");
			System.out.println("Word Experience:\n" + workExperience);
			System.out.println("");
			System.out.println("Skills:\n" + skills);
			
			
	}
			
			public static String getName (Scanner getInput) {
				String name;
				System.out.println("Please enter your first and last name.");
				name = getInput.nextline();
				return name;
				
			}
			
			public static String getContactInformation(Scanner getInput) {
				String contactInformation;
				System.out.println("Please enter your contact information on one Line.");
				contactInformation = getInput.nextline();
				return name;
			}
			
			public static String getEducation(Scanner getInput) {
				String education;
				System.out.println("Please enter your education information on one line.");
				contactEducation = getInput.nextline();
				return name;
			}
			
			public static String getExperience(Scanner getInput) {
				String experience;
				System.out.println("Please enter your experience on one line");
				workExperience = getInput.nextLine();
				return workExperience;
		}
			public static String getSkills(Scanner getInput) {
				String skills;
				System.out.println("Enter your skills on one line.");
				skills = getInput.nextLine();
				return skills;	
			

	}

}
