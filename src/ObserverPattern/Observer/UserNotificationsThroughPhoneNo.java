package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class UserNotificationsThroughPhoneNo implements UserNotificationsAlertObserver {

    String userName = "";
    StocksObservable observable;
    public UserNotificationsThroughPhoneNo (StocksObservable observable, String userName) {
        this.userName = userName;
        this.observable = observable;
    }
    public void sendSms () {
        // Call the sendSms service after fetching phone no from username
        System.out.println("Sms sent to: " + userName);
    }
    @Override
    public void alertUser() {
        sendSms();
    }
}
