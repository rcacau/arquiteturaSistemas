//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DBConn dbConn = DBConn.getInstance();

        dbConn.println("Granvando log da Main!");
    }
}