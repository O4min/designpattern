package behavioral.template.example2;

public class CompanyRegister extends RegisterTemplate {


    public CompanyRegister(Company company) {
        super(company::identify, company::inquiry, company::book);
    }
}
