package com.linhai.demo.design.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 请求类
 * @author: LinHai
 * @create: 2018-08-21 15:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private String requestType;
    private String requestContent;
    private int requestNum;
}
