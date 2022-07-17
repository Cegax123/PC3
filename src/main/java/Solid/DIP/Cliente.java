package Solid.DIP;


public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");



        // Usando Oracle
        InterfazUsuario interfaz_usuario = new InterfazUsuario(new MySQLDatabase());
        interfaz_usuario.saveEmployeeId("E001");

        // Usando Mysql
        interfaz_usuario = new InterfazUsuario(new OracleDatabase());
        interfaz_usuario.saveEmployeeId("E001");

    }
}
