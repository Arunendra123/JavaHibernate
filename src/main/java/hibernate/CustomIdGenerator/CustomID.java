package hibernate.CustomIdGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomID implements IdentifierGenerator {

    public String generateCustId(SharedSessionContractImplementor session) {
    	String customString="MVDC";
    	Connection con=session.connection();
		try {
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select hibernate_sequence.next_val from hibernate_sequence");
			if(rs.next()) {
				return customString+"_"+rs.getInt(1);
			}
			return customString;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customString;
    }

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return generateCustId(session);
	}
}
