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
		return applicationName;
	}
	
	String getBugTitle() {
		return bugtitle;
	}

	String getseverity() {
		return severity;
		
	}
	
	String getPriority() {
		return priority;
		
	}
	
	String getstatus() {
		return status;
		
	}
	
	String getAssignedDeveloper() {
		return assignedDeveloper;
		
	}
	
	void assignToDeveloper(int bug_id, String developerName,String Pgr) {
			assignedDeveloper=developerName;
		updateStatus(Pgr);
	}
	
	String updateStatus(String newstatus) {
		status=newstatus;
		return newstatus;
	}
	
	void displayBugSummary() {
		System.out.println("BugID:"+getBugid());
		System.out.println("Application Name:"+getApplicationName());
		System.out.println("Bug Title:"+getBugTitle());
		System.out.println("Severity:"+getseverity());
		System.out.println("Priority:"+getPriority());
		System.out.println("Status:"+getstatus());
		System.out.println("Assigned Developer:"+getAssignedDeveloper());
		
		
	}
	
	
	public static void main(String[] args) {
		
		BugTracker b1=new BugTracker();
		
		b1.bugid=101;
		b1.applicationName="Amazon Prime Video";
		b1.bugtitle="Login Error";
		b1.severity="High Needed";
		b1.priority="Main";
		b1.status="Bug Generated";
		b1.assignedDeveloper="Not Assigned";		
		b1.displayBugSummary();
		System.out.println("************************************");
		
		
		b1.assignToDeveloper(101, "Vasu","In Development");
		
		b1.displayBugSummary();

	}

}
