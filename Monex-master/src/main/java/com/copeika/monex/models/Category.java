package com.copeika.monex.models;

public class Category {

    private  String name;
    private Integer limit;
    private Integer money_expenditures;

    public Category(String name, Integer limit){
        this.name = name;
        this.limit = limit;
        this.money_expenditures = 0;
    }
    public Category(){
        money_expenditures = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getMoneyExpenditures() {
        return money_expenditures;
    }

    public void setMonetaryExpenditures(Integer money_expenditures) {
        this.money_expenditures = money_expenditures;
    }

    public void addMonetaryExpenditures(Integer money_expenditures) {
        this.money_expenditures += money_expenditures;
    }

}
