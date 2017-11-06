package pkg111mil.tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra{
    private ArrayList<Bebida> bebidas=new ArrayList();
    private double costo;
    
    public Compra(ArrayList<Bebida> bebidas){
        this.costo=0;
       
        StringBuilder tex= new StringBuilder();
        Scanner sn= new Scanner(System.in);
        int opcion;//GUARDA LA OPCION DEL USUARIO
         
        
        do{
            
            
           for (int i=1; i<bebidas.size();i++){
             System.out.println(tex.append(i).append("- ").append(bebidas.get(i).getNombre()).append(" su precio es: ").append(bebidas.get(i).getPrecio()).append(" y su cantidad en el Stock es: ").append(bebidas.get(i).getStock()));
             tex.setLength(0);
            }
            
            System.out.println(tex.append("\nEscribe una de las opciones que desea Comprar \nPrecione «0» si desea  SALIR \n"));tex.setLength(0);
            opcion=(int) sn.nextInt();
            
          if(opcion!=0){  
            realizarCompra(bebidas.get(opcion));
          }  
            
    }while(opcion!=0);

        System.out.println(tex.append("El valor de su compra es de ").append(this.costo).append("\nGracias por su compra.."));

}
    
    
    public void realizarCompra(Bebida bebida){
        int cantidad;
        Scanner sn=new Scanner(System.in);
        System.out.println("Que cantidad desea comprar?¿??");
        cantidad=(int) sn.nextInt();
        
         if(bebida.verificarCantidad(cantidad)){
            this.costo+=cantidad* bebida.getPrecio();
         }else{
           System.out.println("Lo sentimos pero esa cantidad exede a nuestro Stock \nDeberá elegir otro producto o llevar una cantidad menor \n \n");
         }
        
        
    }
    
    
}//FIN DE LA CLASE
