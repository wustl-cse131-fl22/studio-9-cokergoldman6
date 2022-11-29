package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	
	private final Map<String, Student> university;

	public UniversityDatabase() {
		this.university = new HashMap<String, Student>();
	}

	public void addStudent(String accountName, Student student) {
		university.put(accountName, student);
	}

	public int getStudentCount() {
		return university.size();
	}

	public String lookupFullName(String accountName) {
		if(university.get(accountName) == null) {
			return null;
		}
		else {
			return university.get(accountName).getFullName();
		}
	}

	public double getTotalBearBucks() {
		
		double totalBearBucks = 0.0;
		for(Map.Entry entry : university.entrySet()) {
			totalBearBucks += ((Student) entry.getValue()).getBearBucksBalance();
		}
		return totalBearBucks;
	}
}
