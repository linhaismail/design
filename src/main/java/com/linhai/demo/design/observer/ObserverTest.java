package com.linhai.demo.design.observer;

import com.linhai.demo.design.observer.base.Observer;
import com.linhai.demo.design.observer.base.Subject;
import com.linhai.demo.design.observer.ob.NBAObserver;
import com.linhai.demo.design.observer.ob.StockObserver;
import com.linhai.demo.design.observer.sub.BossSubject;
import com.linhai.demo.design.observer.sub.SecretarySubject;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-13 11:06
 */
public class ObserverTest {

    public static void main(String[] args) {

        Subject secretary = new SecretarySubject();
//        Subject secretary = new BossSubject();

        Observer stock = new StockObserver("stockMan", secretary);
        Observer ball = new NBAObserver("ballMan", secretary);
        Observer other = new StockObserver("otherMan", secretary);

        secretary.attach(stock);
        secretary.attach(ball);
        secretary.attach(other);

        secretary.notifyObserver();

        System.out.println("-----------------------------------");
        secretary.detach(other);
        secretary.notifyObserver();
    }
}
