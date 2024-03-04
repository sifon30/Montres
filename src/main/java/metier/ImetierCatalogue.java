package metier;

import java.util.List;
public interface ImetierCatalogue {
public List<Montre> getMontresParMotCle(String mc);
public void addMontre(Montre m);
}