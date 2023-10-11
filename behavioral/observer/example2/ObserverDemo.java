package behavioral.observer.example2;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:8:06 PM
 */
public class ObserverDemo {
    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());
    }


}
