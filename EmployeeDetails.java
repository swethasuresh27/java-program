package homework;

public class EmployeeDetails {
	public void printEmployeeName(String empName ,int empld) {
		System.out.println(empName);
		System.out.println(empld);
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDetails emp=new EmployeeDetails();
emp.printEmployeeName("swetha",101);
emp.getEmployeeAddress("chennai");
emp.printEmployeeSalary(1345.2345);
emp.printEmployeeMobileNumber(12345678l);

	}

}
