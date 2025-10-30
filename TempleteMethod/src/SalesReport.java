
public class SalesReport extends ReportGenerator{
    public SalesReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Load sales");
    }

    @Override
    public void sortData() {
        System.out.println("Sort sales");
    }

    @Override
    public void formatData() {
        System.out.println("Format sales");
    }
}