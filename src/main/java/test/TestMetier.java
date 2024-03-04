package test;

import java.util.List;

import metier.MetierImpl;
import metier.Montre;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Montre> mon = metier.getMontresParMotCle("casio");
for (Montre m : mon)
System.out.println(m.getNomMontre());
}
}