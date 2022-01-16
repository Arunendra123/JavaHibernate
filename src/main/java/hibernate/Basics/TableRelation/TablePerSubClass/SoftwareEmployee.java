package hibernate.Basics.TableRelation.TablePerSubClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="software_employee")
@DiscriminatorValue(value="software_employee")
public class SoftwareEmployee extends Employee{
	
	private String tool;
	
	public SoftwareEmployee() {
	super();
		// TODO Auto-generated constructor stub
	}
	public SoftwareEmployee( String name, String address, int salary,String tool) {
		super(name, address, salary);
		this.tool=tool;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	@Override
	public String toString() {
		return "SoftwareEmployee [tool=" + tool + "]";
	}
}
