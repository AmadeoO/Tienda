package pkg111mil.tienda;

import java.util.Scanner;



public class Bebida {
    private String nombre;
    private int stock;
    private double precio;
    private StringBuilder txt= new StringBuilder();

    
    /*Constructor que recibe como parametro. Pero no es interactivo
     *@param: nombre String
    *@param: stock int
    *@param: precio double
    */
    public Bebida(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
    
    /*contructor que recibe como parametro al ir interactuando con el usuario:
    *@param: nombre String
    *@param: stock int
    *@param: precio double
    */
    public Bebida() {
        
        setNombre2();
        setStock2();
        setPrecio2();
    }
    
    ///GETTERS-----------------
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    //SETTERS---------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    ///SETTERS2-------------

    public void setNombre2() {
        Scanner nom= new Scanner(System.in);
        System.out.println(txt.append("Ingrese el nombre del producto"));txt.setLength(0);
        this.nombre= (String) nom.nextLine(); 
    }

    public void setStock2() {
         Scanner st= new Scanner(System.in);
        System.out.println(txt.append("Ingrese el Stock del producto"));txt.setLength(0);
        this.stock=(int) st.nextInt();
    }

    public void setPrecio2() {
        Scanner pre= new Scanner(System.in);
        System.out.println(txt.append("Ingrese el precio del producto"));txt.setLength(0);
        this.precio=(double) pre.nextDouble();
    }
    //Methods:-------------------------------
    
    public boolean verificarCantidad(int cantidad){
        int disponible=getStock()-cantidad;
     if (disponible>=0){
         setStock(disponible);
         return true;
     }else{
         return false;
     }
    }
   
    
}
