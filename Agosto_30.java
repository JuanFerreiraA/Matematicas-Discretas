package matediscretas;

import javax.swing.JOptionPane;

public class Agosto_30 {

    public static void main(String[] args) {
        boolean P, Q, R, S;
        int opc, num, yesNO;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor selecione: "
                    + "\n 1. Logica de videojuego \n 2. Planificacion de evento"
                    + "\n 3. Seguridad de computadores \n 4. Control de acceso \n "
                    + "5. Razonamiento logico \n 6. Reglas de negocio"));

            if (opc > 0 && opc <= 6) {
                System.out.println("------------------------ " + opc + " ---------------------");
                switch (opc) {
                    case 1:
                        System.out.println(" En un videojuego de aventuras, el jugador "
                                + "debe enfrentarse a un dragón y resolver un acertijo para avanzar."
                                + "\n El acertijo consiste en tres proposiciones:"
                                + "\n P: Si el dragón es amigable, entonces es posible hablar con él."
                                + "\n Q: Si se puede hablar con el dragón, entonces revelará el camino secreto."
                                + "\n R: Si se revela el camino secreto, entonces el jugador podrá avanzar.");

                        yesNO = JOptionPane.showConfirmDialog(null, "El Dragon es amistoso?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            P = Q = R = true;
                        } else {
                            P = Q = R = false;
                        }

                        if (P == true) {
                            System.out.println(" El dragon es amigable por lo que se puede hablar con el");
                            System.out.println(" Al hablar con el dragon se revela el camino secreto");
                            System.out.println(" El jugador puede avanzar\n");
                        } else {
                            System.out.println(" El dragon no es amigable por lo que no se puede hablar con el");
                            System.out.println(" El dragon no revela el camino secreto");
                            System.out.println(" El jugador no puede avanzar\n");
                        }
                        break;

                    case 2:
                        System.out.println(" En una organización, se está planificando un "
                                + "evento importante. Para que el evento sea un éxito,"
                                + "\n se han establecido las siguientes condiciones:"
                                + "\n P: Si se contrata a un buen orador, entonces el evento será interesante."
                                + "\n Q: Si el evento es interesante, entonces habrá una alta asistencia."
                                + "\n R: Si hay una alta asistencia, entonces se obtendrán patrocinadores.\n");

                        yesNO = JOptionPane.showConfirmDialog(null, "Se contrata un buen orador?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            P = Q = R = true;
                        } else {
                            P = Q = R = false;
                        }

                        if (P == true) {
                            System.out.println(" Se contrata un buen orador por lo tanto el evento sera interesante");
                            System.out.println(" Al ser un evento interesante habra alta asistencia");
                            System.out.println(" Al haber muchos asistentes se obtuvieron patrocinadores\n");
                        } else {
                            System.out.println(" No se contrata un buen orador por lo tanto el evento no es interesante");
                            System.out.println(" Al no ser un evento interesante habra poca asistencia");
                            System.out.println(" Al haber pocos asistentes no se obtienen patrocinadores\n");
                        }

                        break;

                    case 3:
                        System.out.println(" En una red de computadoras, se están implementando medidas de seguridad."
                                + "\n Se han establecido las siguientes condiciones:"
                                + "\n P: Si un usuario tiene acceso a los servidores internos,"
                                + " entonces debe tener autenticación de dos factores."
                                + "\n Q: Si un usuario tiene autenticación de dos factores,"
                                + " entonces tiene acceso a ciertos recursos confidenciales."
                                + "\n R: Si un usuario tiene acceso a ciertos recursos "
                                + "confidenciales, entonces se registra su actividad.\n");

                        yesNO = JOptionPane.showConfirmDialog(null, "¿El usuario tiene acceso a los servidores internos?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            P = Q = R = true;
                        } else {
                            P = Q = R = false;
                        }

                        if (P == true) {
                            System.out.println(" El usuario cuenta con autenticacion de dos factores");
                            System.out.println(" El usuario tiene acceso a ciertos recursos confidenciales");
                            System.out.println(" El usuario registra su actividad\n");
                        } else {
                            System.out.println(" El usuario no cuenta con autenticacion de dos factores");
                            System.out.println(" El usuario no tiene acceso a ciertos recursos confidenciales");
                            System.out.println(" El usuario no registra su actividad\n");
                        }

                        break;

                    case 4:
                        System.out.println(" Diseña un sistema de control de acceso que "
                                + "determine si un usuario puede acceder a un sistema"
                                + "\n en función de múltiples condiciones. Debes usar proposiciones compuestas y Java para"
                                + "\n implementar este sistema. Por ejemplo:"
                                + "\n Un usuario puede acceder si tiene credenciales de administrador (P)"
                                + "\n Y si su dirección IP está en la lista de IP permitidas (R)."
                                + "\n Además, si el usuario es un empleado temporal (Q) o es un administrador,"
                                + "\n puede acceder sin importar su dirección IP.\n");

                        yesNO = JOptionPane.showConfirmDialog(null, "¿El usuario tiene credenciales de administrador?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            P = true;
                        } else {
                            P = false;
                        }

                        yesNO = JOptionPane.showConfirmDialog(null, "¿Es empleado temporal?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            Q = true;
                        } else {
                            Q = false;
                        }

                        yesNO = JOptionPane.showConfirmDialog(null, "¿Tiene una direccion IP permitida?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            R = true;
                        } else {
                            R = false;
                        }

                        if (P == true || Q == true) {
                            System.out.println("El usuario puede acceder debido a que es administrador o trabajador temporal\n");
                        } else if (R == true) {
                            System.out.println("El usuario puede acceder debido a que tiene una direccion IP valida\n");
                        } else {
                            System.out.println("El usuario no puede acceder\n");
                        }

                        break;

                    case 5:
                        System.out.println(" Supongamos que estás desarrollando un programa de registro para una biblioteca. Para"
                                + "\n registrarse, un usuario debe cumplir con las siguientes condiciones:"
                                + "\n Debe ser mayor de 18 años (P)."
                                + "\n Debe tener una dirección de correo electrónico válida (Q)."
                                + "\n No debe tener multas pendientes en su cuenta de la biblioteca (R).\n");

                        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                        String txt = JOptionPane.showInputDialog("Ingrese su correo");

                        yesNO = JOptionPane.showConfirmDialog(null, "¿Tiene multas pendientes?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (num > 18) {
                            P = true;
                        } else {
                            P = false;
                        }

                        if (txt.equals("usuario@example.com")) {
                            Q = true;
                        } else {
                            Q = false;
                        }

                        if (yesNO == 0 || yesNO == 0) {
                            R = true;
                        } else {
                            R = false;
                        }

                        if (P == true && Q == true && R == true) {
                            System.out.println("El usuario puede registrarse\n");
                        } else {
                            System.out.println("El usuario no puede registrarse\n");
                        }

                        break;

                    case 6:
                        System.out.println(" Supongamos que estás desarrollando una aplicación de comercio electrónico y necesitas"
                                + "\n establecer reglas de negocio para determinar si un cliente puede realizar una compra. Las"
                                + "\n reglas son las siguientes:"
                                + "\n El cliente debe tener una cuenta activa (P)."
                                + "\n El producto debe estar en stock (Q)."
                                + "\n El cliente debe tener un método de pago válido registrado (R)."
                                + "\n El cliente debe haber iniciado sesión (S).\n");

                        yesNO = JOptionPane.showConfirmDialog(null, "¿Tiene una cuenta activa?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            P = true;
                        } else {
                            P = false;
                        }

                        yesNO = JOptionPane.showConfirmDialog(null, "¿El producto tiene stock?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            Q = true;
                        } else {
                            Q = false;
                        }

                        yesNO = JOptionPane.showConfirmDialog(null, "¿Tiene un metodo de pago valido registrado?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            R = true;
                        } else {
                            R = false;
                        }

                        yesNO = JOptionPane.showConfirmDialog(null, "¿Tiene la sesion iniciada?",
                                "EJERCICIOS", JOptionPane.YES_NO_OPTION);

                        if (yesNO == 0 || yesNO == 0) {
                            S = true;
                        } else {
                            S = false;
                        }

                        if (P == true && Q == true && R == true && S == true) {
                            System.out.println("El usuario puede realizar la compra\n");
                        } else {
                            System.out.println("El usuario no puede realizar la compra\n");
                        }

                        break;
                }
            } else {
                System.out.println("Ingrese un numero valido");
            }
            yesNO = JOptionPane.showConfirmDialog(null, "Desea ver otro ejercicio?", "EJERCICIOS", JOptionPane.YES_NO_OPTION);

        } while (yesNO == 0);
    }
}
