package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.MacBookObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.UserNotificationsAlertObserver;
import ObserverPattern.Observer.UserNotificationsThroughEmail;
import ObserverPattern.Observer.UserNotificationsThroughPhoneNo;

public class Store {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl("Iphone");
//        MacBookObservableImpl macBookObservable = new MacBookObservableImpl("macbook");

        UserNotificationsAlertObserver observer = new UserNotificationsThroughEmail(iphoneObservable, "reaped@gmail.com");
        UserNotificationsAlertObserver observer1 = new UserNotificationsThroughEmail(iphoneObservable, "vibhav@gmail.com");
        UserNotificationsAlertObserver observer2 = new UserNotificationsThroughPhoneNo(iphoneObservable, "reapedJuggler");

        iphoneObservable.add(observer);
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setData(12);
    }
}
