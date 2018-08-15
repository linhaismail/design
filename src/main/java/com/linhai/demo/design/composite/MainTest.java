package com.linhai.demo.design.composite;

/**
 * @description: 组合模式：将对象组合成树形结构，以表示”部分——整体“的层次结构
 *               组合模式使得用户对单个对象和组合对象的使用具有一致性
 * @author: LinHai
 * @create: 2018-08-15 13:41
 */
public class MainTest {

    public static void main(String[] args) {

        ConcreteCompany root = new ConcreteCompany("总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp1 = new ConcreteCompany("华北分公司");
        comp1.add(new HRDepartment("华北分公司人力资源部"));
        comp1.add(new FinanceDepartment("华北分公司财务部"));
        root.add(comp1);

        root.display(1);

        root.lineOfDuty();
    }
}
