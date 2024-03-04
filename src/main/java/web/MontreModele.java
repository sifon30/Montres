package web;

import java.util.ArrayList;
import java.util.List;
import metier.Montre;
public class MontreModele {
private String motCle;
List<Montre> montres = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Montre> getMontres() {
return montres;
}
public void setMontres(List<Montre> montres) {
this.montres = montres;
}

}