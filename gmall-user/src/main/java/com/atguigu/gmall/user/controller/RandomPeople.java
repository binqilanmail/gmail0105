package com.atguigu.gmall.user.controller;

import java.util.Random;

public class RandomPeople {
    public static void main(String[] args) {
        Random col=new Random();
        Random row=new Random();
        int c= col.nextInt(9)+1;
        int r=row.nextInt(16)+1;
        System.out.println("有请第"+r+"排"+"第"+c+"行"+"回答");
    }
}
