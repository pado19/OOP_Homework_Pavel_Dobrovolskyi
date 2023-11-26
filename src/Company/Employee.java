package Company;

class Employee {

    public String name;
    public String position;
    private String eMail;
    private int phone;
    protected int age;

    public Employee(String name, String position, String eMail, int phone, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.age = age;
    }
}
