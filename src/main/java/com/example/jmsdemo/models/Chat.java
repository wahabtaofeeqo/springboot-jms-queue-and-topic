/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jmsdemo.models;

import lombok.Data;

/**
 *
 * @author user
 */
@Data
public class Chat {
    
    private String to;
    private String from;
    private String message;

    public Chat() {
    }
    
    public Chat(String to, String from, String message) {
        this.to = to;
        this.from = from;
        this.message = message;
    }
}
