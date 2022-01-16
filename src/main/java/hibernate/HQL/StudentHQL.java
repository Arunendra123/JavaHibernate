package hibernate.HQL;

public class StudentHQL {
	
	private int id;
    private String name;
    private int rollNo;
    private String address;
    private long mobileNo;
    
    
	public StudentHQL() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentHQL(String name, int rollNo, String address, long mobileNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
		this.mobileNo = mobileNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", address=" + address + ", mobileNo="
				+ mobileNo + "]";
	}
}
