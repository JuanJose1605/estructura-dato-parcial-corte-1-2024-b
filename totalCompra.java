import javax.swing.*;
public class totalCompra {
    public static void main(String[] args) {
        String nombre = "";
        String nProducto = "";
        int precioPr = 0;
        int cantidad = 0;
        int valorB = 0;
        double valorN = 0;
        double valorD = 0;

        nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");
        nProducto = JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
        precioPr = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor unitario del prodcuto"));
        if (precioPr >0 ){
            cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad del producto"));
            if (cantidad>0){
                if (cantidad<10){
                    valorB = cantidad * precioPr;
                    valorN = valorB;
                    JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n" +
                            "Nombre del producto: "+nProducto+"\n" +
                            "Precio del producto: "+precioPr+"\n" +
                            "Cantidad del producto: "+cantidad+"\n" +
                            "Valor bruto: "+valorB+"\n" +
                            "Valor neto: "+valorN+"\n" +
                            "Valor del descuento: "+valorD+" No hay descuento");

                }
                else if (cantidad>=10 && cantidad<20){
                    valorB=cantidad*precioPr;
                    valorD= valorB * 0.05;
                    valorN= valorB - valorD;
                    JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n" +
                            "Nombre del producto: "+nProducto+"\n" +
                            "Precio del producto: "+precioPr+"\n" +
                            "Cantidad del producto: "+cantidad+"\n" +
                            "Valor bruto: "+valorB+"\n" +
                            "Valor neto: "+valorN+"\n" +
                            "Valor del descuento: "+valorD);
                } else if (cantidad>=20) {
                    valorB= cantidad*precioPr;
                    valorD= valorB * 0.07;
                    valorN= valorB - valorD;
                    JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n" +
                            "Nombre del producto: "+nProducto+"\n" +
                            "Precio del producto: "+precioPr+"\n" +
                            "Cantidad del producto: "+cantidad+"\n" +
                            "Valor bruto: "+valorB+"\n" +
                            "Valor neto: "+valorN+"\n" +
                            "Valor del descuento: "+valorD);
                }
            }else {
                JOptionPane.showMessageDialog(null,"La cantidad del producto no es mayor que cero");
            }
        }else {
            JOptionPane.showMessageDialog(null,"El valor unitario no es mayor que cero");
        }
    }

}
