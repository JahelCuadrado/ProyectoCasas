
package casas;

public class Casas {
    
    //Atributos de la clase Casas
    String direccion;
    int codigoPostal;
    int numeroHabitaciones;
    int metrosCuadrados;

    //Metodo construtor de la clase
    public Casas(String direccion, int codigoPostal, int numeroHabitaciones, int metrosCuadrados) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.numeroHabitaciones = numeroHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    /*Método en el que voy a listar las direcciones de las casas, he hecho que haya que pasarle un parametro de tipo entero
    Que servirá para indicar en el mensaje, a que numero de casa nos estamos refiriendo, lo he hecho de igual forma en todos
    los parametros de listado*/
    public void ListadoDirecciones(int x){        
        System.out.println("La dirección de la casa numero " + x + " es: " + direccion);          
    }
    
    //Método en el que voy a listar los codigos postales de las casas
    public void ListadoCodigosPostales(int x){
        System.out.println("El que código postal de la casa numero " + x + " es: " + codigoPostal);
    }
    
    //Método en el que voy a listar el numero de habitaciones de las casas
    public void ListadoNumeroHabitaciones(int x){
        System.out.println("La casa número " + x + " tiene " + numeroHabitaciones + " habitaciones.");
    }
    
    //Método en el que voy a listar los metros cuadrados de las casas    
    public void ListadoMetrosCuadrados(int x){
        System.out.println("La casa número " + x + " tiene " + metrosCuadrados + " metros cuadrados.");
    }
    
    
    /*Método en el que haré que aparezca el menú de elección de la informacion, lo he hecho estático para poder acceder a el
    sin utilizar un objeto en concreto, sino, el nombre de la clase*/
    static void MenuEleccionInformacion(){    
                System.out.println("Dime ¿que información deseas visualizar? \n"
                + "Pulsa 1 para Dirección\n"
                + "Pulsa 2 para Código Postal\n"
                + "Pulsa 3 para Numero de habitaciones\n"
                + "Pulsa 4 para Numero de metros cuadrados\n");         
    }
    
    
    
    
}
