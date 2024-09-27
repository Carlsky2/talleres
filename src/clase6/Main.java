import java.util.Scanner;
import java.util.Stack;


public static boolean estaBalanceada(String expresion) {
    Stack<Character> pila = new Stack<>();

    for (int i = 0; i < expresion.length(); i++) {
        char caracter = expresion.charAt(i);

        if (caracter == '(') {
            pila.push(caracter);
        }

        else if (caracter == ')') {
            if (pila.isEmpty()) {
                return false;
            }
            pila.pop();
        }
    }

    return pila.isEmpty();
}

public void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa una expresión matemática: ");
    String expresion = scanner.nextLine();

    if (estaBalanceada(expresion)) {
        System.out.println("La expresión está balanceada.");
    } else {
        System.out.println("La expresión no está balanceada.");
    }

    System.out.print("Ingresa una oración: ");
    String oracion = scanner.nextLine();

    Stack<String> pila = new Stack<>();

    String[] palabras = oracion.split(" ");

    for (String palabra : palabras) {
        pila.push(palabra);
    }

    if (!pila.isEmpty()) {
        System.out.println("Palabra en la cima de la pila (peek): " + pila.peek());
    }

    System.out.println("Oración invertida:");
    while (!pila.isEmpty()) {
        System.out.print(pila.pop() + " ");
    }
}