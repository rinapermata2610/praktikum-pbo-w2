class EmployeeSortable extends Sortable {
    private String name;
    private double salary;

    public EmployeeSortable(String n, double s) {
        name = n;
        salary = s;
    }

    public void print() {
        System.out.println(name + " " + salary);
    }

    @Override
    public int compare(Sortable b) {
        EmployeeSortable eb = (EmployeeSortable) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }
}
