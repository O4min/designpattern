package creational.factorymethod.example1;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:25 PM
 */
public class DemoClassFileFactory {
    public static void main(String[] args) {
        var classFile = new ClassFileFactory().create(ProgrammingLang.JAVA);
        classFile.execute();
    }
}
