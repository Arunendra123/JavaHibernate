package hibernate.Basics.TableRelation.TablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin")
@DiscriminatorValue(value="admin") 
public class Admin extends Employee{
 
	private String branchName;

	public Admin(String branchName) {
		super();
		this.branchName = branchName;
	}
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String address, int salary,String branchName) {
		super(name, address, salary);
		this.branchName=branchName;
	}

	public String getBranchName() {
		return branchName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Admin [branchName=" + branchName + "]";
	}	
	
}
