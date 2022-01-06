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
public class MethodRef2 {


public static void referMethod(){
    System.out.println("Refer method is calling");
}

public static void main(String[] args) {
    Thread ths=new Thread(MethodRef2::referMethod);
    ths.start();
    
}
    
}
