package payroll;

class EmployeeNotFoundException extends RuntimeException{
	public EmployeeNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		super("Could not find employee" +id);
	}
}
