/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.solid;

/**
 *
 * @author CltControl
 */
public class PagoPayPal extends Pago{
    private boolean loggedIn; // conexión a cuenta PayPal
    private Connection connection;

    @Override
    public void realizarCobro(double monto) {
        if(!loggedIn){
            connection.setConnection();
           
        }
         //cargar el monto de compra al medio de pago
    }
    
    
    
    
    
}
