package hibernate.Basics.TableRelation.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie_1")
public class Movie {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String mname;
	
	@ManyToMany
	private List<Actor> actor;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String mname, List<Actor> actor) {
		super();
		this.mname = mname;
		this.actor = actor;
	}

	public List<Actor> getActor() {
		return actor;
	}
	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}
	public Movie(String mname) {
		super();
		this.mname = mname;
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
