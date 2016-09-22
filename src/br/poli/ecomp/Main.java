/*
 * Copyright (C) 2016 sillas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.poli.ecomp;

import br.poli.ecomp.expressao.PosFixa;

/**
 * Classe inicial da aplicação
 *
 * @author Sillas S. Leal<sillas.s.leal@gmail.com>
 */
public class Main {

    /**
     * Método inicial da aplicação
     *
     * @param args Os argumentos da linha de comando
     */
    public static void main(String[] args) {
        try {
            PosFixa pos = new PosFixa();
            System.out.println(pos.avaliar("5 3 + 6 * 2 1 + /"));
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
