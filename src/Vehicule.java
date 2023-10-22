public class Vehicule {
    private int id;
    private String marque;
    private String typeDeCarburant;

    public Vehicule(int id, String marque, String typeDeCarburant) {
        this.id = id;
        this.marque = marque;
        this.typeDeCarburant = typeDeCarburant;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Marque: " + marque + ", Carburant: " + typeDeCarburant;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehicule vehicule = (Vehicule) obj;
        return id == vehicule.id && marque.equals(vehicule.marque);
    }
}
