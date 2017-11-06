package pkg111mil.tienda;

import java.util.ArrayList;

public class Tienda {
    public static void main(String[] args) {
        
       ArrayList<Bebida> bebidas= new ArrayList();
       bebidas.add(0,new Bebida(" ",0,0.00));
       bebidas.add(1,new Bebida("Coca-Cola",6,56.00));
       bebidas.add(2,new Bebida("Soda",4,20.30));
       bebidas.add(3,new Bebida("Cerveza IPA",9,60.50));
       
       Compra venta= new Compra(bebidas);
       
        }
    }
    
