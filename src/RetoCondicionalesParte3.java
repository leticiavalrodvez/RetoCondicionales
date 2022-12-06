import java.util.Scanner;

public class RetoCondicionalesParte3 {

    public static void main(String[] args) {

        //Contenido de variables

        String producto1 = "[1] Novemina";
        String producto2 = "[2] Ketofen";
        String producto3 = "[3] Ibuprofeno";

        String precio1 = "$150";
        String precio2 = "$200";
        String precio3 = "$100";

        String carac1 = "Antinflamatorio";
        String carac2 = "Antipirético";
        String carac3 = "Analgesico";

        String confirmacion;

        Scanner sc = new Scanner(System.in);

        //Menú principal

        System.out.println("Menú\n" + "[1] Comprar producto\n" + "[2] Consultar precio de producto\n" + "[3] Devoler producto");
        confirmacion = sc.nextLine();

        //Comprar productos

        if (confirmacion.equals("1")) {

            System.out.println("Desea adquirir un producto (Si/NO)");
            confirmacion = sc.nextLine();
            confirmacion = confirmacion.toUpperCase(); //Pasar caracteres a mayusculas.

        if (confirmacion.substring(0, 1).matches("S")) { //En esta linea se comprueba que el valor de confirmacion comience con S, asi podemos validar que la persona escribio si.

            System.out.println("Productos disponibles: \n" +
                    producto1 + ": " + carac2 +  "\n" +
                    producto2 + ": " + carac1 + ", " + carac3 + "\n" +
                    producto3 + ": " + carac1 + ", " + carac3 + "\nCual deseas retirar? (Ingrese número correspondiente al producto deseado).");
            confirmacion = sc.nextLine();

                if (confirmacion.equals("1")) {

                    System.out.println(producto1 + " retirado.");

                } else if (confirmacion.equals("2")) {

                    System.out.println(producto2 + " retirado.");

                } else if (confirmacion.equals("3")) {

                    System.out.println(producto3 + " retirado");

                } else {

                    System.out.println("No ha seleccionado ningun producto disponible.");
                    return;

                }

            }

        //Ver precio de producto

        } else if (confirmacion.equals("2")){

            System.out.println("Desea ver el precio un producto (Si/NO)");
            confirmacion = sc.nextLine();
            confirmacion = confirmacion.toUpperCase(); //Pasar caracteres a mayusculas.

            if (confirmacion.substring(0, 1).matches("S")) {

                System.out.println("Productos disponibles: \n" + producto1 + "\n" + producto2 + "\n" + producto3 + "\nDe cual desea ver el precio? (Ingrese número correspondiente al producto deseado).");
                confirmacion = sc.nextLine();

                if (confirmacion.equals("1")) {

                    System.out.println(producto1 + " " + precio1);

                } else if (confirmacion.equals("2")) {

                    System.out.println(producto2 + " " + precio2);

                } else if (confirmacion.equals("3")) {

                    System.out.println(producto3 + " " + precio3);

                } else {

                    System.out.println("No ha seleccionado ningun producto disponible.");
                    return;

                }

            }

        //Devolución de producto

        } else if (confirmacion.equals("3")){

            System.out.println("Desea realizar la devolución de un producto? (SI/NO)");
            confirmacion = sc.nextLine();
            confirmacion = confirmacion.toUpperCase(); //Pasar caracteres a mayusculas.

            if (confirmacion.substring(0, 1).matches("S")) {

                System.out.println("Cuenta con una nota de devolución? (SI/NO)");
                confirmacion = sc.nextLine();
                confirmacion = confirmacion.toUpperCase();

                if (confirmacion.substring(0, 1).matches("S")) {

                    System.out.println("Productos disponibles: \n" + producto1 + "\n" + producto2 + "\n" + producto3 + "\nCual deseas devolver? (Ingrese número correspondiente al producto deseado).");
                    confirmacion = sc.nextLine();

                    if (confirmacion.equals("1")) {

                        System.out.println(producto1 + " " + "devuelto.");

                    } else if (confirmacion.equals("2")) {

                        System.out.println(producto2 + " " + "devuelto.");

                    } else if (confirmacion.equals("3")) {

                        System.out.println(producto3 + " " + "devuelto.");

                    } else {

                        System.out.println("No ha ingresado ningun producto disponible.");
                        return;
                    }
                } else {

                    System.out.println("Sin nota de devolución no es posible realizar la accion.");
                    return;

                }
            }

        } else {

            System.out.println("No ha ingresado ningun número disponible del menú");
            return;

        }

    }

}
