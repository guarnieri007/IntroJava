/* 1- Pacote */
package intro;
/* 2- Referência as bibliotecas*/

import java.sql.SQLOutput;

/* 3- Classe */
public class Medidas {
    /* 3.1- Atributos - Caracteristicas
    *  3.2- Métodos e Funções
    * */

    public static void main(String[] args)
    {
        calcularAreaModoCompacto();
        calcularAreaModoExtenso();
    }

    public static void calcularAreaModoExtenso()
    {
        System.out.println("Calculo de áreas modo extenso");

        // cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; //largura rece 4 unidades
        comprimento = 3; //largura rece 3 unidades
        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m² e o comprimento de " + comprimento + "m² a área é de " + resultado + "m².");
    }
    public static void calcularAreaModoCompacto()
    {
        System.out.println("Calculo de áreas modo compacto");
        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m² e o comprimento de " + comprimento + "m² a área é de " + largura * comprimento + "m².");
    }
}
