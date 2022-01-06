/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.methodreference;

/**
 *
 * @author Madhankumar Selvaraj
 */
interface Sayable {

void says();

}

public class MethodRef {

public static void message() {
    System.out.println("Hi Says..");
}

public static void main(String[] args) {
    Sayable ss = MethodRef::message;
    ss.says();
}

}
