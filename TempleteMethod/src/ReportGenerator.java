
public abstract class ReportGenerator {

    public ReportGenerator() {}

    public void generateReport() {
        loadData();
        sortData();
        formatData();
        System.out.println("Relatorio gerado \n");
    }

    public void loadData() {
        System.out.println("LoadData");
    }

    public void sortData() {
        System.out.println("SortData");
    }

    public void formatData() {
        System.out.println("FormatData");
    }
}