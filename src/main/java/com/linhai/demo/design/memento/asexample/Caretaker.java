package com.linhai.demo.design.memento.asexample;

import lombok.Data;

/**
 * @description: 管理者：负责保存好备忘录，不能对备忘录的内容进行操作或者检查
 * @author: LinHai
 * @create: 2018-08-15 10:39
 */
@Data
public class Caretaker {

    public Memento memento;
}
