package Solid.ISP;

interface Impresora {
    default void printDocument(){
        System.out.println("La impresora imprime un documento.");
    }
}
