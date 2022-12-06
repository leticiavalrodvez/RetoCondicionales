import java.util.Scanner;

public class RetoCondicionalesParte1 {
    public static void main(String[] args) {

        String name;
        String lastname;
        Integer age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        name = sc.nextLine();

        System.out.println("Ingrese su apellido: ");
        lastname = sc.nextLine();

        System.out.println("Ingresar su edad: ");
        age = sc.nextInt();

        if (age >= 18) {

            System.out.println( name + " " + lastname + " usted es mayor de edad, por lo tanto, puede entrar a la fiesta.");

        } else {

            System.out.println( name + " " + lastname + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");

        }

    }
}