package com.javamethods;

public class BugTracker {
	
	int bugid;
	String applicationName;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	
	int getBugid(){
		return bugid;
		
	}
	
	String getApplicationName() {
		System.out.println("Application Name:"+applicationName);
		return applicationName;
	}
	
	String getBugTitle() {
		System.out.println("Bug Title:"+bugtitle);
		return bugtitle;
	}

	String getseverity() {
		System.out.println("Severity:"+severity);
		return severity;
		
	}
	
	String getPriority() {
		System.out.println("Priority:"+priority);
		return priority;
		
	}
	
	String getstatus() {
		System.out.println("Status:"+status);
		return status;
		
	}
	
	String getAssignedDeveloper() {
		return assignedDeveloper;
		
	}
	
	void assignToDeveloper(int bugid, String developerName) {
		
		assignedDeveloper=developerName;
	}
	
	void updateStatus() {
		
	}
	
	void displayBugSummary() {
		System.out.println("BugID:"+getBugid());
		
		
	}
	
	
	public static void main(String[] args) {
		
		BugTracker b1=new BugTracker();
		
		b1.bugid=101;
		b1.applicationName="";
		b1.bugtitle="";
		b1.severity="";
		b1.priority="";
		b1.status="";
		b1.assignedDeveloper="";
		
		b1.getBugid();
		b1.displayBugSummary();
	}

}
