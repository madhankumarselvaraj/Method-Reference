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
interface Messageable {

Message getMessage(String msg);

}

class Message {

Message(String msg) {
    System.out.print(msg);
}
}

public class ReferenceToConstructor {

public static void main(String[] args) {

    Messageable msg = Message::new;
    msg.getMessage("Hello");

}

}
