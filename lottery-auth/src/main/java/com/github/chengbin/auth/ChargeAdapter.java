package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-01-31 17:45.
 */
public class ChargeAdapter extends  Charge110 implements Charge220{

    @Override
    public void charge220() {
        System.out.println("charge limit 220V!");
    }
}
