package com.zking.rabbitmq.test;

import java.util.Arrays;

public class test01 {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int [] arr = {1,2,3,4,5};
        MyData my = new MyData();

        change(i,str ,num ,arr ,my );
        System.out.println("i="+i);
        System.out.println("str="+str);
        System.out.println("arr="+ Arrays.toString(arr));
        System.out.println("my="+my.a);
        System.out.println("num="+num);
    }


    public  static  void change(int j,String s ,Integer n,int [] a,MyData m){
        j+=1;
        s+="world";
        n+=1;
        a[0]+=1;
        m.a+=1;
    }

}

class MyData{
    int a = 10;
}