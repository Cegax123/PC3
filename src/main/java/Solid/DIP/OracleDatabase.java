package Solid.DIP;


class OracleDatabase implements BaseDatos {
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("El id: " + empId + " es guardado en la base de datos Oracle.");
    }
}
