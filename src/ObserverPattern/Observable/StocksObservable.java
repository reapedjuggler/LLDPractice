package ObserverPattern.Observable;

import ObserverPattern.Observer.UserNotificationsAlertObserver;

// This is the interface for the observable
public interface StocksObservable {
    void add(UserNotificationsAlertObserver observer);
    void remove(UserNotificationsAlertObserver observer);
    void setData(int amount);
    void notifyObserver();
    int getStockCount();
    String getStockName();
}
