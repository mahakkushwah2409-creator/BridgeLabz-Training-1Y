// ReportExporter Interface
interface ReportExporter {

    void exportToCSV(String data);

    void exportToPDF(String data);

    // Newly added feature
    default void exportToJSON(String data) {
        System.out.println("JSON export not supported by this exporter.");
    }
}
class SalesReportExporter implements ReportExporter {

    public void exportToCSV(String data) {
        System.out.println("Exporting Sales Report to CSV: " + data);
    }

    public void exportToPDF(String data) {
        System.out.println("Exporting Sales Report to PDF: " + data);
    }
}

class InventoryReportExporter implements ReportExporter {

    public void exportToCSV(String data) {
        System.out.println("Exporting Inventory Report to CSV: " + data);
    }

    public void exportToPDF(String data) {
        System.out.println("Exporting Inventory Report to PDF: " + data);
    }

    // Override if JSON is supported
    public void exportToJSON(String data) {
        System.out.println("Exporting Inventory Report to JSON: " + data);
    }
}
public class ReportingModule {

    public static void main(String[] args) {

        ReportExporter sales = new SalesReportExporter();
        ReportExporter inventory = new InventoryReportExporter();

        sales.exportToCSV("Sales Data 2026");
        sales.exportToJSON("Sales Data 2026");  // Uses default method

        inventory.exportToPDF("Inventory Data 2026");
        inventory.exportToJSON("Inventory Data 2026");  // Uses overridden method
    }
}
