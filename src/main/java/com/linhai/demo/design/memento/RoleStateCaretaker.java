package com.linhai.demo.design.memento;

import lombok.Data;

/**
 * @description: 角色状态管理
 * @author: LinHai
 * @create: 2018-08-15 11:10
 */
@Data
public class RoleStateCaretaker {

    RoleStateMemento roleStateMemento = new RoleStateMemento();
}
