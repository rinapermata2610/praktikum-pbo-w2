
public class TestSortable {
    public static void main(String[] args) {
        EmployeeSortable[] staff = new EmployeeSortable[3];
        staff[0] = new EmployeeSortable("Antonio Rossi", 2000000);
        staff[1] = new EmployeeSortable("Maria Bianchi", 2500000);
        staff[2] = new EmployeeSortable("Isabel Vidal", 3000000);

        Sortable.shell_sort(staff);

        for (EmployeeSortable e : staff) {
            e.print();
        }
    }
}
