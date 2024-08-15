/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservas;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Metodos {
   private Habitaciones hotel[][]=new Habitaciones[3][3];
  
   public void completarHabitaciones(){
     hotel[0][0]=new Habitaciones("Sucia",301,"Doble",50);
     hotel[0][1]=new Habitaciones("Libre",302,"Simple",60);
     hotel[0][2]=new Habitaciones("Libre",303,"Doble",50);
     hotel[1][0]=new Habitaciones("Libre",203,"simple",40);
     hotel[1][1]=new Habitaciones("Libre",202,"simple",40);
     hotel[1][2]=new Habitaciones("Libre",201,"Doble",40);
     hotel[2][0]=new Habitaciones("Libre",103,"Simple",30);
     hotel[2][1]=new Habitaciones("Libre",102,"Doble",30);
     hotel[2][2]=new Habitaciones("Libre",101,"Simple",30);
}
   
   public void agregarHabitaciones(){
     
      for(int i=0;i<hotel.length;i++){
          for(int j=0;j<hotel.length;j++){
          Habitaciones h=new Habitaciones();
          h.setEstado(JOptionPane.showInputDialog(null,"Digite Estado:"));
          h.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad existente:")));
          h.setTipo(JOptionPane.showInputDialog(null,"Digite el precio del producto:"));
          h.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          hotel[i][j]=h;
           }
        }
    }
   public void visualizacionHabitaciones(){
       String s="";
       for(int i=0;i<hotel.length;i++){
          for(int j=0;j<hotel.length;j++){
             s=s+(i+1)+" "+ hotel[i][j].getEstado()+" "+hotel[i][j].getNumero()+
                  " "+hotel[i][j].getTipo()+" "+hotel[i][j].getPrecio()+"\n\n";
          }    
       }
       JOptionPane.showMessageDialog(null,"El arreglo contiene:\n"+s);
    }
   
   public void modificacionHabitaciones(){
       
        Habitaciones h=new Habitaciones();
        int num;
        int piso;
        String nuevoEstado;
        String nuevoTipo;
        int nuevoPrecio;
        
        piso=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de piso donde se encuentra la habitación que desea editar"));
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de habitacion que desea editar"));
        nuevoEstado=JOptionPane.showInputDialog(null,"Ingrese el nuevo estado de la habitación");
        nuevoTipo=JOptionPane.showInputDialog(null,"Ingrese el nuevo tipo de habitacion");
        nuevoPrecio=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo precio"));
        hotel[(piso-1)][(num-1)]= new Habitaciones(nuevoEstado, h.getNumero(), nuevoTipo,nuevoPrecio);
        JOptionPane.showMessageDialog(null,"La información de la habitación ha sido actualizada con éxito");         
    }    
        
    
   public void resumenHabitaciones(){
       Habitaciones h=new Habitaciones();
   
       int acumuladorLibres=0;
       int acumuladorOcupadas=0;
       int acumuladorSucias=0;
       double porcentajeLibres=0;
       double porcentajeOcupadas=0;
       double porcentajeSucias=0;
       for(int i=0;i<hotel.length;i++){
              if(hotel[i][0].equals("Libre")) {
                    acumuladorLibres=acumuladorLibres+1;
                    porcentajeLibres=acumuladorLibres/9;

                } else if (hotel[i][0].equals("Ocupada")) {
                    acumuladorOcupadas=acumuladorOcupadas+1;
                    porcentajeOcupadas=acumuladorOcupadas/9;
                } else if (hotel[i][0].equals("Sucia")) {
                    acumuladorSucias=acumuladorSucias+1;
                    porcentajeSucias=acumuladorSucias/9;
                }
          
   }
    JOptionPane.showMessageDialog(null,"El total de habitaciones libres es:"+acumuladorLibres+" y el porcentaje es : "+porcentajeLibres);  
    JOptionPane.showMessageDialog(null,"El total de habitaciones ocupadas es:"+acumuladorOcupadas+" y el porcentaje es : "+porcentajeOcupadas);
    JOptionPane.showMessageDialog(null,"El total de habitaciones sucias es:"+acumuladorSucias+" y el porcentaje es : "+porcentajeSucias);
}
}