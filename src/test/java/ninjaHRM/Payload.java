package ninjaHRM;

public class Payload {
	public static String CreateAProject() {
		return "<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>\\r\\n\"\r\n"
				+ "        		+ \"<Project>\\r\\n\"\r\n"
				+ "        		+ \"	<createdBy>sabari</createdBy>\\r\\n\"\r\n"
				+ "        		+ \"	<projectName>test3210</projectName>\\r\\n\"\r\n"
				+ "        		+ \"	<status>Completed</status>\\r\\n\"\r\n"
				+ "        		+ \"	<teamSize>0</teamSize>\\r\\n\"\r\n"
				+ "        		+ \"</Project>\"";
				
	}
}
