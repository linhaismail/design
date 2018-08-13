package com.linhai.demo.design.delegate;

import com.linhai.demo.design.delegate.base.UpdateDelegate;
import com.linhai.demo.design.delegate.ob.NBAObserver;
import com.linhai.demo.design.delegate.ob.StockObserver;
import com.linhai.demo.design.delegate.sub.BossSubject;

/**
 * @description: 委托模式测试
 *               通知者Subject跟观察者Observer不知对方，Observer各不相同
 * @author: LinHai
 * @create: 2018-08-13 16:13
 */
public class DelegateTest {

    public static void main(String[] args) {

        BossSubject subject = new BossSubject();

        StockObserver stock = new StockObserver("stockMan", subject);
        NBAObserver nba = new NBAObserver("nbaMan", subject);

        /*
         * @description:    以下三种写法功能相同
         * @author:         LinHai
         * @create:         2018-08-13 17:08:18
         */
        // 写法一：
        subject.notifyObserver(new UpdateDelegate() {
            @Override
            public void execute() {
                stock.updateStock();
            }
        });
        // 写法二：
        subject.notifyObserver(() -> stock.updateStock());
        // 写法三：
        subject.notifyObserver(stock::updateStock);

        subject.notifyObserver(nba::updateNBA);

    }
}
