package com.zym.pattern.prototype.deepcopy;

import lombok.Data;

import java.io.*;

/**
 * @author zhouyumeng
 * @date 2021/12/21
 **/
@Data
public class Vehicle implements Cloneable, Serializable {

    private String name;
    private Wheel wheel;

    @Override
    public Vehicle clone() {
        try {
            Vehicle vehicle = (Vehicle) super.clone();
            vehicle.wheel = (Wheel) this.wheel.clone();
            return vehicle;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Vehicle deepClone() {
        Vehicle vehicle = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            vehicle = (Vehicle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bos) {
                    bos.close();
                }
                if (null != oos) {
                    oos.close();
                }
                if (null != bis) {
                    bis.close();
                }
                if (null != ois) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return vehicle;
    }

}
