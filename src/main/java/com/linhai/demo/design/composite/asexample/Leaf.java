package com.linhai.demo.design.composite.asexample;

import org.apache.commons.lang3.StringUtils;

/**
 * @description: 在组合中表示叶节点对象，叶节点没有子节点。
 *               由于叶节点没有再增加分支和树叶，所以实现add和remove没有意义，
 *               但是这样做可以消除叶节点和枝节点对象在抽象层的差别，他们具有完全一致的接口。
 * @author: LinHai
 * @create: 2018-08-15 13:49
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("can't add to a leaf.");
    }

    @Override
    public void remove(Component component) {
        System.out.println("can't remove from a leaf.");
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.repeat("**", depth) + name);

    }
}
