import java.util.Scanner;

public class RetoCondicionalesParte2 {
    public static void main(String[] args) {

        String pelicula1 = "[1] Star Wars";
        String pelicula2 = "[2] El señor de los anillos";
        String pelicula3 = "[3] Barbie: La princesa y la plebeya";

        String confirmacion;
        String seleccion;
        String comentario;

        Scanner sc = new Scanner(System.in);

        //Menú principal

        System.out.println("Menú\n" + "[1] Consultar películas\n" + "[2] Alquilar película\n" + "[3] Devoler película");
        confirmacion = sc.nextLine();

        if (confirmacion.equals("1")) {

            System.out.println("Peliculas disponibles: \n" + pelicula1 + "\n" + pelicula2 + "\n" + pelicula3);
            return;

        } else if (confirmacion.equals("2")) {

            //Alquilar película

            System.out.println("Desea alquilar alguna película del catálogo actual? (Si/NO)");
            confirmacion = sc.nextLine();
            confirmacion = confirmacion.toUpperCase(); //Pasar caracteres a mayusculas.

            if (confirmacion.substring(0, 1).matches("S")) { //En esta linea se comprueba que el valor de confirmacion comience con S, asi podemos validar que la persona escribio si.

                System.out.println("Peliculas disponibles: \n" + pelicula1 + "\n" + pelicula2 + "\n" + pelicula3 + "\nCual deseas retirar? (Ingrese número correspondiente a la película deseada).");
                confirmacion = sc.nextLine();

                if (confirmacion.equals("1")) {

                    System.out.println( pelicula1 + " retirada.");

                } else if (confirmacion.equals("2")) {

                    System.out.println( pelicula2 + " retirada.");

                } else if (confirmacion.equals("3")) {

                    System.out.println( pelicula3 + " retirada.");

                } else {

                    System.out.println("No ha seleccionado ninguna película disponible.");
                    return;

                }

            }

        } else if (confirmacion.equals("3")) {

            //Devolver pelicula

            System.out.println("Desea realizar la devolución de una película? (SI/NO)");
            confirmacion = sc.nextLine();
            confirmacion = confirmacion.toUpperCase(); //Pasar caracteres a mayusculas.

            if (confirmacion.substring(0, 1).matches("S")) {

                System.out.println("Peliculas disponibles: \n" + pelicula1 + "\n" + pelicula2 + "\n" + pelicula3);
                System.out.println("Ingrese número correspondiente a la película que desea devolver:");
                seleccion = sc.nextLine();


                if (seleccion.equals("1")) {

                    System.out.println( pelicula1 + " devuelta.");

                } else if (seleccion.equals("2")) {

                    System.out.println( pelicula2 + " devuelta.");

                } else if (seleccion.equals("3")) {

                    System.out.println( pelicula3 + " devuelta.");

                } else {

                    System.out.println("No ha ingresado ninguna película disponible.");
                    return;
                }

                //Anotaciones

                System.out.println("Desea agregar algún comentario o anotación a la película? (SI/NO)");
                confirmacion = sc.nextLine();
                confirmacion = confirmacion.toUpperCase(); //Pasar caracteres a mayusculas.

                if (confirmacion.substring(0, 1).matches("S")) {

                    System.out.println("Ingrese comentario:");
                    comentario = sc.nextLine();
                    System.out.println("Comentario guardado con exito.");

                    System.out.println("Anotacion: " + comentario);

                }

            }

        } else {

            System.out.println("No ha ingresado ningun número válido del menú.");

        }
    }
}