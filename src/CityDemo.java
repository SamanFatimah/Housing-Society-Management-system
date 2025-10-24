public class CityDemo {
    public static void main(String[] args) {
        System.out.println("City Housing Management System Started\n");

        // Step 1: Create CityHousing (auto-loads LDA Avenue 1 & 2)
        CityHousing city = new CityHousing();

        // Step 2: Add another society
        System.out.println("\n--- Adding a New Society ---");
        city.addSociety("DHA Phase 6", 4);

        // Step 3: Book a few plots
        System.out.println("\n--- Booking Plots ---");
        city.bookPlot("LDA Avenue 1", "A", "1-001");  // Block A, plot 1-001
        city.bookPlot("LDA Avenue 2", "B", "2-005");  // Block B, plot 2-005

        // Step 4: Cancel a booking
        System.out.println("\n--- Cancelling a Booking ---");
        city.cancelPlot("LDA Avenue 1", "A", "1-001");

        // Step 5: Compute totals for all societies
        System.out.println("\n--- Computing City Totals ---");
        city.computeCityTotals();

        // Step 6: Remove a society
        System.out.println("\n--- Removing a Society ---");
        city.removeSociety("DHA Phase 6");

        // Step 7: Print complete city report
        System.out.println("\n--- Final City Report ---");
        city.printCityReport();

        System.out.println("\nProgram finished successfully!");
    }
}



		
		