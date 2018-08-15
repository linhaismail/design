package com.linhai.demo.design.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 游戏角色
 * @author: LinHai
 * @create: 2018-08-15 11:07
 */
@Data
@AllArgsConstructor
public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento createMemento() {
        return new RoleStateMemento(20,30,50);
    }

    public void setMemento(RoleStateMemento memento) {
        this.vit = memento.vit;
        this.atk = memento.atk;
        this.def = memento.def;
    }

    public void show() {
        System.out.println("vitality:" + vit);
        System.out.println("attack:" + atk);
        System.out.println("defense:" + def);
    }
}
