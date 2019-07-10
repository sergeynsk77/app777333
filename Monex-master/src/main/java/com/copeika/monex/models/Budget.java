package com.copeika.monex.models;

public class Budget {
    private Integer money;
    private boolean check;

    public Budget() {
        check = true;
    }

    public Budget(Integer money){
        this.money = money;
        check = true;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public boolean getCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
