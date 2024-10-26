/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.solid;
import java.util.List;
/**
 *
 * @author CltControl
 */
public class Compra {
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private Carrito carrito;
    

    public Compra(Pago pago,Carrito carrito ) {
        this.pago = pago;
        this.carrito=carrito;
    }

    public Compra(PagoPayPal pagoPayPal,Carrito carrito) {
        this.pagoPayPal = pagoPayPal;
        this.carrito=carrito;
    }
    
}
