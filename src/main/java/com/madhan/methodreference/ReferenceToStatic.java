/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.methodreference;

import java.util.function.BiFunction;

/**
 *
 * @author Madhankumar Selvaraj
 */
class Arithmetic {

public static int addData(int a, int b) {
    return a + b;
}
}

public class ReferenceToStatic {

public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> adder = Arithmetic::addData;
    int result = adder.apply(1000, 250);
    System.out.println("" + result);

}

}
