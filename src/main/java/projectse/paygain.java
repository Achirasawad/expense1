package projectse;

public class paygain {
    private String name;
    private String surename;
    private int age ,balance,money;

    public paygain(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;

    }
    public paygain(int money){
        this.money = money;
    }
    public int getBalance(){
        return balance;
    }
    public int getMoney(int money){
        return money;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurename() {
        return surename;
    }

    @Override
    public String toString() {
        return  name + " " + surename + " " + age;
    }

    public int income(int money){
        this.balance = this.balance+money;

        return balance;
    }

    public int expense(int money){
        this.balance = this.balance-money;

        return balance;
    }
}
