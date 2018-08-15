package com.linhai.demo.design.composite.asexample;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关的操作，比如Add和Remove
 * @author: LinHai
 * @create: 2018-08-15 13:46
 */
public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    // 集合对象，用来存储其下属的枝节点和叶节点
    List<Component> childrenComponent = new ArrayList<>();

    @Override
    public void add(Component component) {
        childrenComponent.add(component);
    }

    @Override
    public void remove(Component component) {
        childrenComponent.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.repeat("**", depth) + name);
        for (Component component : childrenComponent) {
            component.display(depth + 1);
        }
    }
}
