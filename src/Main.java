import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewEmployee employee1 = new NewEmployee("yamada",22,"Personnel");
        NewEmployee employee2 = new NewEmployee("suzuki",45,"Information Systems");
        NewEmployee employee3 = new NewEmployee("itou",35,"Sales");
        NewEmployee employee4 = new NewEmployee("hujita",18,"Sales");

        List<NewEmployee> newEmployees = new ArrayList<>();
        newEmployees.add(employee1);
        newEmployees.add(employee2);
        newEmployees.add(employee3);
        newEmployees.add(employee4);

        System.out.println("新入社員名簿");
        Comparator<NewEmployee> namesort = Comparator.comparing(NewEmployee::getName);
        List<NewEmployee> namesorted = newEmployees.stream().sorted(namesort).toList();
        System.out.println(namesorted);

        System.out.println("営業部配属");
        final String sales = "Sales";
        List<NewEmployee>salesemployee = newEmployees.stream()
                .filter(employee -> sales.equals(employee.getDepartment()))
                .toList();
        System.out.println(salesemployee);

        System.out.println("35歳以下の新入社員を大文字で表示");
        List<String> under35 = newEmployees.stream()
                .filter(under -> 35 > under.getAge())
                .map(uppercase -> uppercase.getName().toUpperCase())
                .toList();
        System.out.println(under35);
    }
}
