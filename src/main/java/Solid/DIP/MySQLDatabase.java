package Solid.DIP;


class MySQLDatabase implements BaseDatos {
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("El id: " + empId + " es guardado en la base de datos MySQL.");
    }
}
