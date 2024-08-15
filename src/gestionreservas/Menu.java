/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservas;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Menu {
    private byte opc;
   
   public void mostrarMenu(){
    Metodos m=new Metodos();
    m.completarHabitaciones();
      while(opc!=4){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***MENÚ PRINCIPAL***\n\n"
                         + "1.Visualizacion\n"
                         + "2.Modificacion\n"
                         + "3.Resumen\n"
                         + "4.Salir"
                         + "Digite su opción:"));
         switch(opc){
             case 1:{
                m.visualizacionHabitaciones();
                break;
             } 
             case 2:{
                m.modificacionHabitaciones();
                break;
             }
             case 3:{
                m.resumenHabitaciones();
                break;
             }
             case 4:{
                System.exit(0);
                break;
             }   
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
