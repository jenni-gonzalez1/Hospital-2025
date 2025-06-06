 package controles;

class logincontroler {

    //datos del usuario temporal
    String[][] credenciales = { 
        {  "Ana Martínez" , "AnaM@8523"   },
        {  "Carlos López"    ,    "CarL!1742"},
        {  "Laura Gómez"      ,    "LauG#3961"   },
        { "Miguel Torres"     ,   "MigT@2810"   },
        { "Daniela Ruiz"      ,   "DanR%4437"   },
        { "Andrés Fernández"  ,   "AndF*9021"   },
        { "Paula Herrera"     ,   "PauH&66742"  }, 
        { "Luis Ramírez"      ,   "LuiR5389" } ,
        { "Juan Pérez"        ,   "JuaP$7195" }
    };
   

    public boolean validaCionDatos (String EUsuario, String Econtraseña) {

        boolean res=false;

        for (int i = 0; i < credenciales.length; i++) {

            if (credenciales[i][0].equals(EUsuario) && credenciales[i][1].equals(Econtraseña)) {
            
                res=true;
           
            } else {
                res = false;
        }

            
        }

        return res;

    }
}
