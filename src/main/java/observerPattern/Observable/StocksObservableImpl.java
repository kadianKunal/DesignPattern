package observerPattern.Observable;

import observerPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class StocksObservableImpl implements StocksObservable {

    private final List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void addSubscriber(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeSubscriber(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribers() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void updateStockCount(int newStockCount) {

        if(this.stockCount == 0 && newStockCount > 0){
            notifyAllSubscribers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
