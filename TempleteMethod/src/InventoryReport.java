public class InventoryReport extends ReportGenerator {

    public InventoryReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Load inventory");
    }

    @Override
    public void sortData() {
        System.out.println("Sort inventory");
    }

    @Override
    public void formatData() {
        System.out.println("Format inventory");
    }
}