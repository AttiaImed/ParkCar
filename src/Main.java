public class Main {
    public static void main(String[] args) {


        Vehicule vehicule1 = new Vehicule(1, "Toyota", "essence");
        Vehicule vehicule2 = new Vehicule(2, "Honda", "essence");
        Voiture voiture1 = new Voiture(3, "Ford", "diesel", "noire");
        Voiture voiture2 = new Voiture(4, "Volkswagen", "essence", "rouge");

        Station station = new Station(101, "Station A");

        station.ajouterVehicule(vehicule1);
        station.ajouterVehicule(vehicule2);
        station.ajouterVehicule(voiture1);
        station.ajouterVehicule(voiture2);

        System.out.println(station);

        int nbrVoitureEssence = station.NbrVoitureEssence();
        System.out.println("Nombre de voitures essence en cours de traitement : " + nbrVoitureEssence);

        int nbrVoitureNoire = station.NbrVoitureNoire();
        System.out.println("Nombre de voitures noires en cours de traitement : " + nbrVoitureNoire);
    }
}
