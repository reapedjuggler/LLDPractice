package ObserverPattern.Observable;

import ObserverPattern.Observer.UserNotificationsAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class MacBookObservableImpl implements StocksObservable{
    List<UserNotificationsAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    String stockName;
    public MacBookObservableImpl (String stockName) {
        this.stockName = stockName;
    }
    @Override
    public void add(UserNotificationsAlertObserver observer) {
        observerList.add(observer);
    }
    @Override
    public void remove(UserNotificationsAlertObserver observer) {
        observerList.remove(observer);
    }
    @Override
    public void setData(int amount) {
        if (stockCount == 0) {
            notifyObserver();
        }
        stockCount += amount;
    }
    @Override
    public void notifyObserver() {
        for (UserNotificationsAlertObserver observer : observerList) {
            observer.alertUser();
        }
    }
    @Override
    public int getStockCount() {
        return stockCount;
    }
    @Override
    public String getStockName() {
        return stockName;
    }
}
