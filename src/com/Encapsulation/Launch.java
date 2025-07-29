package com.Encapsulation;

public class Launch {
    public static void main(String[] args) {

        Demo demo = new Demo();
//        System.out.println(demo);
//        demo.xyz();
        int res = demo.getBal();
        System.out.println("Balance Before " +res);

        int newbal = 5000;
        demo.setBal(newbal);
        res = demo.getBal();
        System.out.println("Balance After "+ res);

    }
}
