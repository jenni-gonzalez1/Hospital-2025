public class LoginControles {

    // Datos de Usuario Temporal
    String[][] credenciales = {
        { "admin",  "admin123"},
        { "juan.perez",  "jp456!"},
        { "maria.lopez",  "ml789@"},
        { "invitado",  "guest2024"},
        { "soporte",  "helpMeNow!"},
    };

    public boolean validacionDatos(String Eusuario, String Econtrasena) {
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i][0].equals(Eusuario) && credenciales[i][1].equals(Econtrasena)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LoginControles auth = new LoginControles();

        // Prueba simple
        boolean valido = auth.validacionDatos("juan.perez", "jp456!");
        if (valido) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
