import java.util.ArrayList;
import java.util.List;

public class Station {
    private int id;
    private String nom;
    private List<Vehicule> vehicules = new ArrayList<>();

    public Station(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void ajouterVehicule(Vehicule vehicule) {
        if (vehicules.size() < 10) {
            vehicules.add(vehicule);
        } else {
            System.out.println("La station est pleine. Impossible d'ajouter plus de véhicules.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Station: " + nom + "\nVéhicules en cours de traitement:\n");
        for (Vehicule vehicule : vehicules) {
            result.append(vehicule.toString()).append("\n");
        }
        return result.toString();
    }

    public int NbrVoitureEssence() {
        int count = 0;
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getTypeDeCarburant().equalsIgnoreCase("essence")) {
                count++;
            }
        }
        return count;
    }

    public int NbrVoitureNoire() {
        int count = 0;
        for (Vehicule vehicule : vehicules) {
            if (vehicule instanceof Voiture) {
                Voiture voiture = (Voiture) vehicule;
                if (voiture.getCouleur().equalsIgnoreCase("noire")) {
                    count++;
                }
            }
        }
        return count;
    }
}
