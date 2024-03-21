/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Inventario inventario = new Inventario(5);

        while (true) {
            String codigo = JOptionPane.showInputDialog("Ingrese el código del producto:");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:"));

            Producto producto = new Producto(codigo, nombre, precio, cantidad);
            inventario.agregarProducto(producto);

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro producto?", "Agregar Producto", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                break;
            }
        }

        inventario.mostrarProductos();

        JOptionPane.showMessageDialog(null, "Total de ganancia esperada: " + inventario.calcularTotalGanancia());
    
    }
    
}
