package com.zym.pattern.prototype.deepcopy;

/**
 * @author zhouyumeng
 * @date 2021/12/21
 **/
public class Client {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("宝马");
        Wheel wheel = new Wheel("24K纯金轮毂");
        vehicle.setWheel(wheel);

        Vehicle vehicle1 = vehicle.clone();
        //Vehicle vehicle1 = vehicle.deepClone();
        vehicle.getWheel().setName("木质轮毂");
        System.out.println(vehicle.getName() + "-----" + vehicle.getWheel().getName() + vehicle.getWheel().hashCode());
        //vehicle1.getWheel().setName("");
        System.out.println(vehicle1.getName() + "-----" + vehicle1.getWheel().getName() + vehicle1.getWheel().hashCode());
        //System.out.println(vehicle1.getWheel());
    }

}
