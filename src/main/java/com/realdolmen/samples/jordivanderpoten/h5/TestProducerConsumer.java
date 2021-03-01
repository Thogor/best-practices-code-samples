package com.realdolmen.samples.jordivanderpoten.h5;

import java.util.ArrayList;
import java.util.List;

public class TestProducerConsumer {
    public static void main(String [] args){
        //ListA
        List<A> listA = new ArrayList<A>();

        listA.add(new A());
        listA.add(new B());
        listA.add(new C());

        A a0 = listA.get(0);
        A a1 = listA.get(1);
        A a2 = listA.get(2);

        //ListB
        List<B> listB = new ArrayList<B>();

        listB.add(new B());

        B b0 = listB.get(0);

        //not compiled
        //danger of **adding** non-B objects using listA reference
        //listA = listB;

        //not compiled
        //danger of **getting** non-B objects using listB reference
        //listB = listA;

        //Solution


        //Solution #1 <? super A> aka lower bound aka contravariance aka consumers guarantees that it is operates by A and all superclasses, that is why it is safe to add

        List<? super A> listSuperA;
        listSuperA = listA;
        listSuperA = new ArrayList<Object>();

        listSuperA.add(new A());
        listSuperA.add(new B());

        Object o0 = listSuperA.get(0);

        //<? extends A> aka upper bound aka covariance aka producers guarantees that it is operates by A and all subclasses, that is why it is safe to get and cast

        List<? extends A> listExtendsA;
        listExtendsA = listA;
        listExtendsA = listB;

        A a5 = listExtendsA.get(0);

    }
}
