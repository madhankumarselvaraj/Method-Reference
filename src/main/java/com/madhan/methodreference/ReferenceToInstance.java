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
interface Sayables {

void says();

}

public class ReferenceToInstance {

public void saySomething() {
    System.out.println("Say something");
}

public static void main(String[] args) {

    ReferenceToInstance ref = new ReferenceToInstance(); // This instance is a reference 

    Sayables ss = ref::saySomething;
    ref.saySomething();
}
}
