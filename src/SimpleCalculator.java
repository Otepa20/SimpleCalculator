  //Description du Programme
  //Le programme demande à l'utilisateur d'entrer deux nombres et de choisir une opération. Il
  //effectue le calcul et affiche le résultat.

import java.util.Scanner; // Scanner il permet  de saisir  les donnees qui seront entre
public class SimpleCalculator {  //Le nom de ma classe
    public static void   main( String [] args){

        double num1 = 0;  // J'ai inicialize une variable et j'ai lui est declare
        double num2 = 0; //'ai inicialize une variable et j'ai lui est declare
        char operator; // Ici la variable operator n'a pas ete inicialize, elle sera inicialise au moment execution
        double answer = 0;  //  C'est la valeur du reponse ou de la sortie

        Scanner scanObject = new Scanner (System.in);
        System.out.println("Enter first number :");
        num1 = scanObject.nextDouble();
        System.out.println("Enter second number :");
        num2 = scanObject.nextDouble();
        System.out.println("Enter the operator :");
        operator = scanObject.next().charAt(0);
        switch (operator){  //Comme nous avons deja vu le swith je penses que ca devais etre une bonne pratique
            // Etant que le switch comme elle est utilise sur le choix multiple base sur la valeur d'une variable
            case '+': answer = num1 + num2;
                System.out.println(num1+" " +operator+""+num2+" ="+answer);
            break;
            case '-': answer = num1 - num2;
                System.out.println(num1+" " +operator+""+num2+" ="+answer);
            break;
            case '*': answer = num1 * num2;
                System.out.println(num1+" " +operator+""+num2+" ="+answer);
            break;
            case '/': answer = num1 / num2;
             if (num2==0) {
                 System.out.println("The division by zero is not possible");
                 break;
             } else
                System.out.println(num1+" " +operator+""+num2+" ="+answer);
            break;
            case '%': answer = num1 % num2;
                System.out.println(num1+" " +operator+""+num2+" ="+answer);
            break;
            default : System.out.println("This operator is not valid"); break;  // L'exeption en cas de faire entre une operation qui n'existe pas

        }
        scanObject.close();

    }
}


