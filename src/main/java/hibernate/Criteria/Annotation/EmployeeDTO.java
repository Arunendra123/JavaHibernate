package hibernate.Criteria.Annotation;

public class EmployeeDTO {

	private String name;
	private String address;
	private int salary;
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
    public static EmployeeDTO of(Employee emp) {
		return new EmployeeDTO(emp.getName(),emp.getAddress(),emp.getSalary());
	}
    
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getSalary() {
		return salary;
	}
}
