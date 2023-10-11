package behavioral.observer.example2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:8:04 PM
 */
public class PCLNewsAgency {
    private String news;

    private PropertyChangeSupport changeSupport;

    public PCLNewsAgency() {
        changeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener changeListener) {
        changeSupport.addPropertyChangeListener(changeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener changeListener) {
        changeSupport.removePropertyChangeListener(changeListener);
    }

    public void setNews(String value) {
        changeSupport.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}