public class Q59 {
	public static void main(String[] args) {
		String branch = "ECE";
		int semester = 1;
		switch(semester){ 
			case 1:System.out.println("ICP-CSE 1001");
			switch(branch){
				case "ECE":System.out.println("ECE is learning ICP");
				case "CSE":
				case "EE":System.out.println("EE is learning ICP");
			}
		case 2:
		case 3:
		case 1:
		default:System.out.println("Default");
		}
	}
}
//Duplicate case