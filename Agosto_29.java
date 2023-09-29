package matediscretas;

import javax.swing.JOptionPane;

public class Agosto_29 {

    public static void main(String[] args) {
        int opc, num, yesNO;
        String user, password;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor selecione: "
                    + "\n 1. Ejercicio 1 \n 2. Ejercicio 2 "
                    + "\n 3. Ejercicio 3 \n 4. Ejercicio 4"
                    + "\n 5. Ejercicio 5 \n 6. Ejercicio 6 \n 7. Ejercicio 7 "
                    + "\n 8. Ejercicio 8 \n 9. Ejercicio 9 \n 10. Ejercicio 10 "
                    + "\n 11. Ejercicio 11 \n 12. Ejercicio 12"));

            if (opc > 0 && opc <= 12) {
                System.out.println("--------------------------- " + opc + " -------------------------------");
                switch (opc) {
                    case 1:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

                        if (num % 5 == 0 && num % 3 == 0) {
                            System.out.println("El numero es divisible  entre 3 y 5");
                        } else {
                            System.out.println("El numero no es divisible entre 3 y 5");
                        }
                        break;

                    case 2:
                        user = JOptionPane.showInputDialog("Ingrese su usuario");
                        password = JOptionPane.showInputDialog("Ingrese su contraseña");

                        if (user.equals("usuario123") && password.equals("contraseña456")) {
                            System.out.println("Acceso concedido");
                        } else {
                            System.out.println("Acceso denegado");
                        }
                        break;

                    case 3:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

                        if (num % 2 == 0 || num % 3 == 0) {
                            System.out.println("El numero es par o multiplo de 3");
                        } else {
                            System.out.println("El numero no es par ni multiplo de 3");
                        }
                        break;

                    case 4:
                        user = JOptionPane.showInputDialog("¿Es administrador?\n Si \n No");
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de puntos"));

                        if (user.equals("Si") || num > 1000) {
                            System.out.println("Acceso concedido");
                        } else {
                            System.out.println("Acceso invalido");
                        }
                        break;

                    case 5:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));

                        if (num >= 0) {
                            System.out.println("Numero valido");
                        } else {
                            System.out.println("Numero invalido");
                        }
                        break;

                    case 6:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación de un alumno"));

                        if (num > 60) {
                            System.out.println("Estudiante aprobado");
                        } else {
                            System.out.println("Estudiante no aprobado");
                        }
                        break;

                    case 7:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus ingresos mensuales"));
                        user = JOptionPane.showInputDialog("¿Tiene deudas pendientes?\n Si \n No");

                        if (num > 2000 && user.equals("No")) {
                            System.out.println("Puede solicitar una tarjeta de credito");
                        } else {
                            System.out.println("No puede solicitar una tarjeta de credito");
                        }
                        break;

                    case 8:
                        password = JOptionPane.showInputDialog("¿Tiene la llave?\n Si \n No");

                        if (password.equals("Si")) {
                            System.out.println("Puede abrir la puerta");
                        } else {
                            System.out.println("No puede abrir la puerta");
                        }
                        break;

                    case 9:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

                        if (num % 2 == 0) {
                            System.out.println("El numero es par");
                        } else {
                            System.out.println("El numero no es par");
                        }
                        break;

                    case 10:
                        user = JOptionPane.showInputDialog("Ingrese su usuario");
                        password = JOptionPane.showInputDialog("Ingrese su codigo de verificación");

                        if (user.equals("usuario123") && password.equals("123456")) {
                            System.out.println("Acceso concedido");
                        } else {
                            System.out.println("Acceso denegado");
                        }
                        break;

                    case 11:
                        user = JOptionPane.showInputDialog("¿Es administrados? \n Si \n No");
                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su direccion IP"));

                        if (user.equals("Si") || num == 123 || num == 456) {
                            System.out.println("Acceso concedido");
                        } else {
                            System.out.println("Acceso denegado");
                        }
                        break;

                    case 12:
                        user = JOptionPane.showInputDialog("Ingrese una palabra");
                        password = JOptionPane.showInputDialog("Ingrese una secuencia numerica");

                        int palabra = user.length();
                        int numero = password.length();
                        int cifrado = Math.max(palabra, numero);

                        StringBuilder resultado = new StringBuilder();

                        for (int i = 0; i < cifrado; i++) {
                            if (i < palabra) {
                                resultado.append(user.charAt(i));
                            }
                            if (i < numero) {
                                resultado.append(password.charAt(i));
                            }
                        }
                        System.out.println("Palabras intercaladas: " + resultado.toString());
                        break;
                }
            } else {
                System.out.println("Ingrese un numero valido");
            }
            yesNO = JOptionPane.showConfirmDialog(null, "Desea ver otro ejercicio?", "EJERCICIOS", JOptionPane.YES_NO_OPTION);

        }while (yesNO == 0);
    }
}
