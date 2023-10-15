package behavioral.template.example2;

public class DemoLambdaTemplate {

    public static void main(String[] args) {
        var personRegister = new PersonRegister(new Person());
        var companyRegister = new CompanyRegister(new Company());
        personRegister.register();
        companyRegister.register();
    }
}
