public class CustomerReport extends ReportGenerator {

    public CustomerReport() {
        super();
    }

    @Override
    public void loadData() {
        System.out.println("Load customer");
    }

    @Override
    public void sortData() {
        System.out.println("Sort customer");
    }

    @Override
    public void formatData() {
        System.out.println("Format customer");
    }
}