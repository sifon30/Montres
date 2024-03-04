package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Montre> getMontresParMotCle(String mc) {
List<Montre> mon= new ArrayList<Montre>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from MONTRES where NOM_MONTRE LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Montre m = new Montre();
m.setIdMontre(rs.getLong("ID_Montre"));
m.setNomMontre(rs.getString("NOM_Montre"));
m.setPrix(rs.getDouble("PRIX"));
mon.add(m);
}
} catch (SQLException e) {
e.printStackTrace();
}
return mon;
}
@Override
public void addMontre(Montre m) {
// TODO Auto-generated method stub
}
}