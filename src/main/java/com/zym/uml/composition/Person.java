package com.zym.uml.composition;

/**
 * @author zhouyumeng
 * @date 2021/12/01
 **/
public class Person {

    private Head head = new Head();

    private IDCard idCard;

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}
