package com.zym.uml.aggregation;

/**
 * @author zhouyumeng
 * @date 2021/12/01
 **/
public class Computer {

    private Mouse mouse;

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
