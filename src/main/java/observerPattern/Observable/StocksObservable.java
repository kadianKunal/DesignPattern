package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void addSubscriber(NotificationAlertObserver observer);

    public void removeSubscriber(NotificationAlertObserver observer);

    public void notifyAllSubscribers();

    public void updateStockCount(int stockCount);

    public int getStockCount();
}
