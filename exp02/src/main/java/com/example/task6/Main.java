package com.example.task6;

public class Main {
    public static void main(String[] args) {
        shallowCopy();
        deepCopy();
    }

    public static void shallowCopy(){
        System.out.println("浅拷贝------------------------>");
        Customer customer = new Customer(1,"张三",new Address("湖南省","长沙市","天心区"));
        // 浅拷贝
        Customer shallowCopyCustomer = customer.clone();
        // 显示差异
        showDiff(customer,shallowCopyCustomer);
    }

    public static void deepCopy(){
        System.out.println("深拷贝------------------------>");
        Customer customer = new Customer(1,"张三",new Address("湖南省","长沙市","天心区"));
        // 深拷贝
        Customer deepCopyCustomer = customer.clone();
        deepCopyCustomer.setAddress(customer.getAddress().clone());
        // 显示差异
        showDiff(customer,deepCopyCustomer);
    }

    public static void showDiff(Customer customer,Customer copyCustomer){
        // 修改原对象的地址信息
        customer.getAddress().setDistrict("岳麓区");
        System.out.println("原对象：" + customer);
        System.out.println("拷贝对象：" + copyCustomer);
    }
}
