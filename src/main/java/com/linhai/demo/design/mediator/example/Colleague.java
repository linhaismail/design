package com.linhai.demo.design.mediator.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 抽象同事类
 * @author: LinHai
 * @create: 2018-08-21 17:32
 */
@Data
@AllArgsConstructor
public class Colleague {

    public Mediator mediator;
}
