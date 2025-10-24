public class CityHousing {
    private HousingSociety[] societies;
    private int count; // tracks active societies

    // Constructor: preloads both societies
    public CityHousing() {
        societies = new HousingSociety[2];
        societies[0] = new HousingSociety("LDA Avenue 1", 5);
        societies[1] = new HousingSociety("LDA Avenue 2", 5);
        count = 2;
    }

    // Add a new society (with array resizing)
    public void addSociety(String name, int streets) {
        if (count == societies.length) {
            HousingSociety[] temp = new HousingSociety[societies.length * 2 + 1];
            for (int i = 0; i < societies.length; i++) {
                temp[i] = societies[i];
            }
            societies = temp;
        }
        societies[count++] = new HousingSociety(name, streets);
        System.out.println("Society '" + name + "' added successfully!");
    }

    // Remove a society by name
    public void removeSociety(String name) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (societies[i] != null && societies[i].getName().equalsIgnoreCase(name)) {
                // shift all next elements left
                for (int j = i; j < count - 1; j++) {
                    societies[j] = societies[j + 1];
                }
                societies[count - 1] = null;
                count--;
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Society '" + name + "' removed successfully!");
        else
            System.out.println("Society '" + name + "' not found.");
    }

    // Find a society by a keyword in its name
    public HousingSociety findSociety(String keyword) {
        for (int i = 0; i < count; i++) {
            if (societies[i].getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Society found: " + societies[i].getName());
                return societies[i];
            }
        }
        System.out.println("Society '" + keyword + "' not found.");
        return null;
    }

    // Relay booking request to correct society and block
    public void bookPlot(String societyKeyword, String blockName, String plotID) {
        HousingSociety s = findSociety(societyKeyword);
        if (s != null) {
            s.bookPlot(blockName, plotID);
        }
    }

    // Relay cancellation request
    public void cancelPlot(String societyKeyword, String blockName, String plotID) {
        HousingSociety s = findSociety(societyKeyword);
        if (s != null) {
            s.cancelPlot(blockName, plotID);
        }
    }

    // Compute city-wide totals
    public void computeCityTotals() {
        System.out.println("\nCITY TOTALS (All Societies Combined):");
        for (int i = 0; i < count; i++) {
            HousingSociety s = societies[i];
            s.computeTotals(); // assumes computeTotals prints society totals
        }
    }
	// Add this method at the end of your CityHousing class
public void printCityReport() {
    System.out.println("\n==================== COMPLETE CITY REPORT ====================");
    for (int i = 0; i < count; i++) {
        HousingSociety s = societies[i];
        s.printReports();
    }
    System.out.println("==============================================================");
}

}
