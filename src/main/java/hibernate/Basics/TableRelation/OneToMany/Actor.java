package hibernate.Basics.TableRelation.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String aname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="movie_id")
	private List<Movie> movie;
	
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String aname, List<Movie> movie) {
		super();
		this.aname = aname;
		this.movie = movie;
	}
	
	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", aname=" + aname + ", movie=" + movie + "]";
	}
	
	
}
