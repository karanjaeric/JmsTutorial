/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jms.tutorial.learn;

import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author erick.karanja
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {

    static final long serialVersionUID = -7462433555964441775L;
    private UUID id;
    private String message;

}
