package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class UserNotificationsThroughEmail implements UserNotificationsAlertObserver {

    StocksObservable observable;
    String email = "";
//    boolean notifyByEmailTrue = false; // This can be implemented in this way as well
    public UserNotificationsThroughEmail(StocksObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    /*
    NotificationThroughEmail () {
        // Do a db query for this
    }
    */

    void sendEmail () {
        System.out.println("Hi: " + email + " The stocks of " + observable.getStockName() + "have arrived" );
    }
    @Override
    public void alertUser() {
//        if (notifyByEmailTrue)    // For other implementation if we don't want to create multiple classes
            sendEmail();
              /*
                else
                sendMessage();
            */
    }
}
