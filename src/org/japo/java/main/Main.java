/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final String COMIDA1 = "Carne";
        final String COMIDA2 = "Pescado";
        final String COMIDA3 = "Sopa";

        final int PUAS1 = 0;
        final int PUAS2 = 3;
        final int PUAS3 = 4;

        String comida;
        int puas;

        System.out.println("Alternativa Tenedor");
        System.out.println("===================");

        System.out.print("Tipo de comida .: ");
        comida = SCN.nextLine();

        if (comida.equals(COMIDA1)) {
            puas = PUAS2;

        } else if (comida.equals(COMIDA2)) {
            puas = PUAS3;

        } else {
            puas = PUAS1;
        }

        System.out.println(
                "---");

        System.out.printf(
                "Tenedor con ....: %d púas%n", puas);
    }

}
