package com.atguigu.gmall.manage.controller;


public class TestFdfs {
    public static void main(String[] args) {
        String originalFilename="112.23.213.213.mp4";
        int i = originalFilename.lastIndexOf(".");
        String extName = originalFilename.substring(i+1);
        System.out.println(extName);
    }
}
