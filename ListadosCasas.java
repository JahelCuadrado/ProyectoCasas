
package casas;

import java.util.Scanner;

public class ListadosCasas {
    
    public static void main(String[] args) {
        
        //Arrays en los que almacenaré los datos de las casas, no es muy necesario, pero de esta forma utilizo los Arrays en el programa :)
        String[] direcciones = {"Calle Rojiza, número 23","Calle Buxter, número 78","Calle Gothan, número 128","Calle Xandar, número 15","Calle Kree, número 689","Calle Marvel, número 616"};
        int[] codigosPostales = {37120,30890,65220,96331,71200,85852};
        int[] numeroDeHabitaciones = {6,10,15,3,8,2};
        int[] numeroDeMetrosCuadrados = {90, 456, 1230, 56, 89, 145};
        
        /*Creacion de los objetos casa pasandole cada uno de sus parametros correspondientes mediante la posicion de los Array, he creado un objeto por casa porque pienso 
        que le puedo dar mas juego, Tiene mas potencial y el código de la clase Casas se reduce de esta forma*/
        Casas casa1 = new Casas(direcciones[0], codigosPostales[0], numeroDeHabitaciones[0], numeroDeMetrosCuadrados[0]);
        Casas casa2 = new Casas(direcciones[1], codigosPostales[1], numeroDeHabitaciones[1], numeroDeMetrosCuadrados[1]);
        Casas casa3 = new Casas(direcciones[2], codigosPostales[2], numeroDeHabitaciones[2], numeroDeMetrosCuadrados[2]);
        Casas casa4 = new Casas(direcciones[3], codigosPostales[3], numeroDeHabitaciones[3], numeroDeMetrosCuadrados[3]);
        Casas casa5 = new Casas(direcciones[4], codigosPostales[4], numeroDeHabitaciones[4], numeroDeMetrosCuadrados[4]);
        Casas casa6 = new Casas(direcciones[5], codigosPostales[5], numeroDeHabitaciones[5], numeroDeMetrosCuadrados[5]);
        
        //Mensaje de bienvenida
        System.out.println("Bienvenid@ a mi programa de visualización de informacion de Casas :)\n"
                + "Este programa contiene información de 6 casas diferentes.\n");
        
        //Scanner para pedirle al usuario que información desea visualizar
        Scanner entrada = new Scanner(System.in);
        
        //Contador con el que controlaré el siguiente bucle
        int contador = 0;
        
        //Bucle que utilizaré para darle una nueva informacion al usuario en caso de que así lo desee
        while(contador == 0){
        
        //Llamo al metodo menú para que aparezca el menú de eleccion de la información.
        Casas.MenuEleccionInformacion();
        
        //Aqui guardaré la eleccion del usuario
        int eleccionCasa = entrada.nextInt();
        
        //condicinal que mostrara la información en base a la eleccion del usuario
        switch(eleccionCasa){
        
            case 1:
                casa1.ListadoDirecciones(1);//En caso de que eligiese uno, llamo al metodo de mostrar direcciones y le paso un parametro que será el numero de la case, realizo lo mismo en todos los casos
                casa2.ListadoDirecciones(2);
                casa3.ListadoDirecciones(3);
                casa4.ListadoDirecciones(4);
                casa5.ListadoDirecciones(5);
                casa6.ListadoDirecciones(6);
            break;
            case 2:
                casa1.ListadoCodigosPostales(1);
                casa2.ListadoCodigosPostales(2);
                casa3.ListadoCodigosPostales(3);
                casa4.ListadoCodigosPostales(4);
                casa5.ListadoCodigosPostales(5);
                casa6.ListadoCodigosPostales(6);
            break;
            case 3:
                casa1.ListadoNumeroHabitaciones(1);
                casa2.ListadoNumeroHabitaciones(2);
                casa3.ListadoNumeroHabitaciones(3);
                casa4.ListadoNumeroHabitaciones(4);
                casa5.ListadoNumeroHabitaciones(5);
                casa6.ListadoNumeroHabitaciones(6);
            break;    
            case 4:
                casa1.ListadoMetrosCuadrados(1);
                casa2.ListadoMetrosCuadrados(2);
                casa3.ListadoMetrosCuadrados(3);
                casa4.ListadoMetrosCuadrados(4);
                casa5.ListadoMetrosCuadrados(5);
                casa6.ListadoMetrosCuadrados(6);
            break;
            default: System.out.println("Opcion incorrecta\n");;
            break;
        }
        
        
        /*Aqui le pregunto a usuario si quiere visualizar otra información, en caso de que diga que no, contador pasará a valer 1
        y terminará el bucle y por lo tanto el programa*/
        System.out.println("\n¿Quieres visualizar otra información?\n"
                + "Pulsa 1 para SI\n"
                + "Pulsa 2 para NO\n");
        int informacionDeNuevo = entrada.nextInt();
        
        if(informacionDeNuevo==2){
            contador=1;
            System.out.println("\nEspero que te haya gustado mi programa :), Adios");
        }
        }     
    }    
}
