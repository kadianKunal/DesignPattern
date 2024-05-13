package observerPattern;

import observerPattern.Observable.GoogleStocksObserverImpl;
import observerPattern.Observable.IphoneStocksObservableImpl;
import observerPattern.Observable.StocksObservable;
import observerPattern.Observer.EmailAlertObserverImpl;
import observerPattern.Observer.MobileAlertObserverImpl;
import observerPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StocksObservable iphoneStocksObservable = new IphoneStocksObservableImpl();

        NotificationAlertObserver observer1 =
                new EmailAlertObserverImpl("Kunal", "abc@google.com", iphoneStocksObservable);

        NotificationAlertObserver observer2 =
                new MobileAlertObserverImpl("Yash", "911234567890", iphoneStocksObservable);

        iphoneStocksObservable.addSubscriber(observer1);
        iphoneStocksObservable.addSubscriber(observer2);

        StocksObservable googlePixelStocksObservable = new GoogleStocksObserverImpl();

        NotificationAlertObserver observer3 =
                new EmailAlertObserverImpl("Rama", "rama@xyz.com", googlePixelStocksObservable);

        googlePixelStocksObservable.addSubscriber(observer3);

        iphoneStocksObservable.updateStockCount(10);
        googlePixelStocksObservable.updateStockCount(5);

        iphoneStocksObservable.updateStockCount(-5);
        googlePixelStocksObservable.updateStockCount(-5);

        googlePixelStocksObservable.updateStockCount(2);
        googlePixelStocksObservable.updateStockCount(2);

    }
}
