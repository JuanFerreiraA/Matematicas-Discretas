package matediscretas;

import java.util.*;
import javax.swing.JOptionPane;

public class Septiembre_19 {

    public static void main(String[] args) {
        Set<Integer> conjuntoA;
        Set<Integer> conjuntoB;
        Set<Integer> conjuntoC;
        Set<Integer> conjuntoD;
        Set<String> conjuntoX;
        Set<String> conjuntoY;
        Set<Integer> union;
        Set<Integer> union2;
        Set<String> unionString;
        Set<Integer> interseccion;
        Set<String> interseccionString;
        Set<Integer> diferencia;
        Set<Integer> diferencia2;
        Set<String> diferenciaString;
        Set<Integer> conjuntoUniversal;
        Set<String> conjuntoUniversalString;

        int opc, num, yesNO;
        String letter;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresar numero del ejercicio\n\n"
                    + "Ejercios del 1 - 33\n "));
            if (opc > 0 && opc <= 33) {
                System.out.println("Ejercicio " + opc);
                switch (opc) {
                    case 1:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        System.out.println("A U B: " + union);

                        break;
                    case 2:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoY = new HashSet<>(Arrays.asList("b", "c", "d"));
                        System.out.println("X: " + conjuntoX);
                        System.out.println("Y: " + conjuntoY);

                        unionString = new HashSet<>(conjuntoX);
                        unionString.addAll(conjuntoY);
                        System.out.println("X U Y: " + unionString + "\n");

                        break;
                    case 3:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        System.out.println("A U X: []\n");

                        break;
                    case 4:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        interseccion = new HashSet<>(conjuntoA);
                        interseccion.retainAll(conjuntoB);
                        System.out.println("Intersección: " + interseccion + "\n");

                        break;
                    case 5:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoY = new HashSet<>(Arrays.asList("b", "c", "d"));
                        System.out.println("X: " + conjuntoX);
                        System.out.println("Y: " + conjuntoY);

                        interseccionString = new HashSet<>(conjuntoX);
                        interseccionString.retainAll(conjuntoY);
                        System.out.println("Intersección: " + interseccionString + "\n");
                        break;
                    case 6:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        System.out.println("Interseccion: []\n");
                        break;
                    case 7:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        diferencia = new HashSet<>(conjuntoA);
                        diferencia.removeAll(conjuntoB);
                        System.out.println("Diferencia (A - B): " + diferencia + "\n");
                        break;
                    case 8:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoY = new HashSet<>(Arrays.asList("b", "c", "d"));
                        System.out.println("X: " + conjuntoX);
                        System.out.println("Y: " + conjuntoY);

                        diferenciaString = new HashSet<>(conjuntoX);
                        diferenciaString.removeAll(conjuntoY);
                        System.out.println("Diferencia (X - Y): " + diferenciaString + "\n");
                        break;
                    case 9:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        diferencia = new HashSet<>(conjuntoA);
                        diferencia.removeAll(conjuntoX);
                        System.out.println("Diferencia (A - X): " + diferencia + "\n");
                        break;
                    case 10:
                        conjuntoA = new HashSet<>(Arrays.asList(3, 4));
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        System.out.println("U: " + conjuntoUniversal);
                        System.out.println("A: " + conjuntoA);

                        Set<Integer> complemento = new HashSet<>(conjuntoUniversal);
                        complemento.removeAll(conjuntoA);
                        System.out.println("Complemento de A': " + complemento + "\n");
                        break;
                    case 11:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoUniversalString = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
                        System.out.println("U: " + conjuntoUniversalString);
                        System.out.println("X: " + conjuntoX);

                        Set<String> complementoString = new HashSet<>(conjuntoUniversalString);
                        complementoString.removeAll(conjuntoX);
                        System.out.println("Complemento de X': " + complementoString + "\n");
                        break;
                    case 12:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        System.out.println("U: " + conjuntoUniversal);
                        System.out.println("X: " + conjuntoX);

                        complemento = new HashSet<>(conjuntoUniversal);
                        complemento.removeAll(conjuntoX);
                        System.out.println("Complemento de X': " + complemento + "\n");
                        break;
                    case 13:
                        num = 3;
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        System.out.println("A: " + conjuntoA);

                        boolean perteneceA = conjuntoA.contains(num);
                        System.out.println("¿" + num + " pertenece a A? " + perteneceA + "\n");
                        break;
                    case 14:
                        letter = "d";
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c", "d"));
                        System.out.println("X: " + conjuntoX);

                        boolean perteneceX = conjuntoX.contains(letter);
                        System.out.println("¿" + letter + " pertenece a X? " + perteneceX + "\n");

                        break;
                    case 15:
                        num = 4;
                        letter = "b";
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        perteneceX = conjuntoX.contains(letter);
                        perteneceA = conjuntoA.contains(num);

                        System.out.println("¿" + num + " pertenece a A? " + perteneceA);
                        System.out.println("¿" + letter + " pertenece a X? " + perteneceX + "\n");
                        break;
                    case 16:
                        num = 5;
                        conjuntoA = new HashSet<>(Arrays.asList(6, 7, 8));
                        System.out.println("A: " + conjuntoA);

                        boolean noPerteneceA = !conjuntoA.contains(num);
                        System.out.println("¿" + num + " no pertenece a A? " + noPerteneceA + "\n");
                        break;
                    case 17:
                        letter = "a";
                        conjuntoX = new HashSet<>(Arrays.asList("x", "y", "z"));
                        System.out.println("X: " + conjuntoX);

                        boolean noPerteneceX = !conjuntoX.contains(letter);
                        System.out.println("¿" + letter + " no pertenece a X? " + noPerteneceX + "\n");
                        break;
                    case 18:
                        num = 5;
                        letter = "x";
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        noPerteneceA = !conjuntoA.contains(num);
                        noPerteneceX = !conjuntoX.contains(letter);

                        System.out.println("¿" + num + " no pertenece a A? " + noPerteneceA);
                        System.out.println("¿" + letter + " no pertenece a X? " + noPerteneceX + "\n");
                        break;
                    case 19:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2));
                        conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        System.out.println("XA: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        boolean esSubconjuntoOIgual = conjuntoB.containsAll(conjuntoA);
                        System.out.println("A es subconjunto o igual a B: " + esSubconjuntoOIgual + "\n");

                        break;
                    case 20:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
                        conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("X: " + conjuntoX);
                        System.out.println("Y: " + conjuntoY);

                        boolean esSubconjuntoOIgualString = conjuntoY.containsAll(conjuntoX);
                        System.out.println("X es subconjunto o igual a Y: " + esSubconjuntoOIgualString + "\n");

                        break;
                    case 21:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        esSubconjuntoOIgual = conjuntoX.containsAll(conjuntoA);
                        System.out.println("A es subconjunto o igual a X: " + esSubconjuntoOIgual + "\n");
                        break;
                    case 22:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2));
                        conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        boolean esSubconjuntoPropio = conjuntoB.containsAll(conjuntoA) && !conjuntoB.equals(conjuntoA);
                        System.out.println("A es subconjunto propio de B: " + esSubconjuntoPropio + "\n");
                        break;
                    case 23:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
                        conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));
                        System.out.println("X: " + conjuntoX);
                        System.out.println("Y: " + conjuntoY);

                        boolean esSubconjuntoPropioString = conjuntoY.containsAll(conjuntoX) && !conjuntoY.equals(conjuntoX);
                        System.out.println("X es subconjunto propio de Y: " + esSubconjuntoPropioString + "\n");
                        break;
                    case 24:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("X: " + conjuntoX);

                        esSubconjuntoPropio = conjuntoX.containsAll(conjuntoA) && !conjuntoX.equals(conjuntoA);
                        System.out.println("A es subconjunto propio de X: " + esSubconjuntoPropio + "\n");

                        break;
                    case 25:
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        System.out.println("U: " + conjuntoUniversal);
                        System.out.println("A: " + conjuntoA);

                        esSubconjuntoOIgual = conjuntoUniversal.containsAll(conjuntoA);
                        System.out.println("A es subconjunto del conjunto universal: " + esSubconjuntoOIgual + "\n");
                        break;
                    case 26:
                        conjuntoUniversalString = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
                        conjuntoX = new HashSet<>(Arrays.asList("b", "c", "d"));
                        System.out.println("U: " + conjuntoUniversalString);
                        System.out.println("X: " + conjuntoX);

                        esSubconjuntoOIgual = conjuntoUniversalString.containsAll(conjuntoX);
                        System.out.println("X es subconjunto del conjuntoi universal: " + esSubconjuntoOIgual + "\n");

                        break;
                    case 27:
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        System.out.println("U: " + conjuntoUniversal);
                        System.out.println("A: " + conjuntoA);

                        esSubconjuntoOIgual = conjuntoUniversal.containsAll(conjuntoA);
                        System.out.println("A es subconjunto del conjunto universal: " + esSubconjuntoOIgual);

                        conjuntoUniversalString = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        esSubconjuntoOIgual = conjuntoUniversalString.containsAll(conjuntoX);
                        System.out.println("X es subconjunto del conjuntoi universal: " + esSubconjuntoOIgual + "\n");

                        break;
                    case 28:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
                        conjuntoC = new HashSet<>(Arrays.asList(2, 4, 6));
                        conjuntoD = new HashSet<>(Arrays.asList(5, 6, 7));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);
                        System.out.println("C: " + conjuntoC);
                        System.out.println("D: " + conjuntoD);

                        union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        System.out.println("A U B: " + union);

                        union2 = new HashSet<>(conjuntoC);
                        union2.addAll(conjuntoD);
                        System.out.println("C U D: " + union2);

                        interseccion = new HashSet<>(union);
                        interseccion.retainAll(union2);
                        System.out.println("(A U B) Intersección (C U D): " + interseccion + "\n");

                        break;

                    case 29:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("Y: " + conjuntoB);

                        diferencia = new HashSet<>(conjuntoA);
                        diferencia.removeAll(conjuntoB);
                        System.out.println("Diferencia (A - B): " + diferencia);

                        diferencia2 = new HashSet<>(conjuntoB);
                        diferencia2.removeAll(conjuntoA);
                        System.out.println("Diferencia (B - A): " + diferencia2);

                        union = new HashSet<>(diferencia);
                        union.addAll(diferencia2);
                        System.out.println("A Δ B :(A - B) U (B - A): " + union + "\n");
                        break;

                    case 30:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5, 6));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        complemento = new HashSet<>(conjuntoB);
                        complemento.removeAll(conjuntoA);
                        System.out.println("Complemento de A: " + complemento);

                        Set<Integer> complemento2 = new HashSet<>(conjuntoA);
                        complemento2.removeAll(conjuntoB);
                        System.out.println("Complemento de B: " + complemento2);

                        interseccion = new HashSet<>(complemento);
                        interseccion.retainAll(complemento2);
                        System.out.println("A'  ∩  B' : " + interseccion);

                        union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        Set<Integer> complemento3 = new HashSet<>(union);
                        complemento3.removeAll(interseccion);
                        System.out.println("Complemento de (A'  ∩  B'): " + complemento + "\n");
                        break;

                    case 31:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        complemento = new HashSet<>(conjuntoB);
                        complemento.removeAll(conjuntoA);
                        System.out.println("Complemento de A: " + complemento);

                        complemento2 = new HashSet<>(conjuntoA);
                        complemento2.removeAll(conjuntoB);
                        System.out.println("Complemento de B: " + complemento2);

                        interseccion = new HashSet<>(complemento);
                        interseccion.retainAll(complemento2);
                        System.out.println("A'  ∩  B' : " + interseccion + "\n");
                        break;
                    case 32:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoB = new HashSet<>(Arrays.asList(2, 3, 4, 5, 6));
                        System.out.println("A: " + conjuntoA);
                        System.out.println("B: " + conjuntoB);

                        interseccion = new HashSet<>(conjuntoA);
                        interseccion.retainAll(conjuntoB);
                        System.out.println("A  ∩  (B U {5,6})  : " + interseccion + "\n");

                        break;
                    case 33:
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        System.out.println("U: " + conjuntoUniversal);

                        complemento = new HashSet<>(conjuntoUniversal);
                        complemento.removeAll(conjuntoUniversal);
                        System.out.println("Complemento de U: " + complemento + "\n");
                        break;
                }
            } else {
                System.out.println("Ingrese un numero valido");
            }
            yesNO = JOptionPane.showConfirmDialog(null, "Desea ver otro ejercicio?", "EJERCICIOS", JOptionPane.YES_NO_OPTION);

        } while (yesNO == 0);
    }
}
