package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String name;
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String name, String emailId, StocksObservable observable){
        this.name = name;
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending email to " + name);
    }
}
