package behavioral.template.example1;

public class TemplateDemo {

    public static void main(String[] args) {
        var registerPerson = new RegisterPerson();
        registerPerson.register("test");

        var registerEmployee = new RegisterEmployee();
        registerEmployee.register("another test");

        var registerCompany = new RegisterCompany();
        registerCompany.register("other test");
    }

}
