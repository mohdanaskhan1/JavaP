package com.java8.StramAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Launch {
    public static void main(String[] args) {
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(18);
        aL.add(19);
        aL.add(20);
        aL.add(17);
        aL.add(10);
        aL.add(9);
        aL.add(0);

//        Stream1<Integer> stream = aL.stream();
//        Stream1<Integer> map = stream.map(t->t*5);
//        Stream1<Integer> sorted = map.sorted();
//        Stream1<Integer> filter = sorted.filter(t -> t % 2 == 0);
//        Integer reduce = filter.reduce(0, (a, b) -> (a + b));
//        System.out.println(reduce);

        System.out.println(
                aL.stream()
                .map(t->t*5)
                .filter(t->t%2==0)
                .sorted()
                .reduce(0,(a,b)->(a+b))
        );







        //Stream1 Created
//        Stream1<Integer> stream = aL.stream();
//        //Stream1 Consumed
//        //new stream created
//        Stream1<Integer> filter = stream.filter(n -> n % 2 == 0);
//        Stream1<Integer> map = filter.map(n -> n * 2);
//
//        map.forEach(System.out::println);

        //IMPERATIVE
//        Iterator<Integer> itr= aL.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //FOR EACH
//        Consumer<Integer> objectConsumer = new Consumer<>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//
//        aL.forEach(objectConsumer);

//        aL.forEach((integer)->System.out.println(integer)); //lambda exp
//        aL.forEach(System.out::println);  //lambda exp with method reference


//        ArrayList<Integer> aL1 = aL;
//        int index = 0;
//        for (Integer i : aL1){
//            aL1.set(index,i*3);
//            index++;
//        }
//        System.out.println(aL1);
//
//        int sum = 0;
//        for (Integer i : aL1){
//            if(i%2==0) {
//                System.out.print(i + " ");
//                sum+=i;
//            }
//        }
//        System.out.println("\n"+sum);


    }
}
