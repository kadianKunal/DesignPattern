package observerPattern.Observer;

import observerPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements  NotificationAlertObserver {

    String name;
    String phoneNo;
    StocksObservable observable;

    public MobileAlertObserverImpl(String name, String phoneNo, StocksObservable observable) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending msg to " + name);
    }
}
