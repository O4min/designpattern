package behavioral.observer.example2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:8:05 PM
 */
public class PCLNewsChannel implements PropertyChangeListener {

    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    // standard getter and setter
}
