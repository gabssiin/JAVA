package AulasDoPapaiGuanabara.operadores;
 public class Main {
     public static void main(String[] args) {

/*int n1 = 2;
int n2 = 8;
float m = (n1 + n2)/2;
System.out.print("A média é igual a:" + m);
     }
 }

*/
     int numero = 5;
     int valor = 5 + ++numero;
             System.out.println(valor);
//unário
int numero2 = 7;
numero2--;
System.out.println(numero2);
//math
         float y = 7.7f;
         int ar = (int) Math.ceil(y);
         System.out.println(ar);

         double ale = Math.random();
         System.out.println(ale);
//operador ternario
         int n1,n2,r;
          n1 = 10;
          n2 = 9;
          r = (n1>n2)?0:2;
         System.out.println(r);

     }
 }




 /*
* + é usado para adição e concatenção se usado em strings
 * será usado para multiplicação
 / para a divisão
 e % o resto dessa divisão
  */

/*
OPERADORES UNÁRIOS
++ incremento ou seja= a++ é a = a +1
-- decremento ou seja a-- é a = a -1
 */

/*
OPERADORES DE ATRIBUIÇÃO
+=
-=
*=
/=
%=
 */

/*
CLASSE MATH
PI= Math.PI
Exponeciaçao = Math.pow
Raiz Quadrada= Math.sqrt
Raiz Cúbica = Math.cbrt

 */

/*
ARREDONDAMENTOS
Valor absoluto= Math.abs
Arredonda pra baixo= Math.floor
Arredonda pra cima= Math.ceil
Arredonda aritmeticamente= Math.round

*/

/*
GERADOR DE NÚMEROS
Math.random() = gera numeros aleatorios de 0.0 entre 1.0
Se quiser fazer inteiros segue a dica:
         double ale = Math.random();
         int n = (int) (5 + ale * (10-5));
         System.out.println(n);
 */


/*
OPERADORES TERNARIOS
maior = n1 > n2 ? n1 : n2;

*/


/*
OPERADORES RELACIONAIS
> MAIOR
< MENOR
>=
<=
== IGUAL
!= DIFERENÇA
 */

/*
COMPARANDO STRINGS
STRING NOME1 = "Gustavo";
STRING NOME2 = "Gustavo";
STRING NOME3 = new String ("Gustavo");
String res;
res = (nome1==nome2)?"igual":"diferente"
System.out.println(res);
 se eu colocar nome1==nome3 vai dar diferente!!!!! pq usamos o new
 se eu quiser verificar (objetos) só o conteúdo seria melhor usar
 res=(nome1.equals(nome3))?"igual":"diferente";
 */


/*
OPERADORES LÓGICOS
&& e true && false
|| ou false || true
^. xou. true ^ true
! .nao.
 */