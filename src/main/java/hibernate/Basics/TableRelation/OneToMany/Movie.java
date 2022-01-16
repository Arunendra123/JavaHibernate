package hibernate.Basics.TableRelation.OneToMany;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String mname;
	
	@OneToMany(mappedBy="movie")
	private List<Actor> actor;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String mname) {
		super();
		this.mname = mname;
	}
	
	public List<Actor> getActor() {
		return actor;
	}
	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", mname=" + mname + "]";
	}
}
