package vetoresG;

public class Main {
    public static void main(String[] args) {
        int v[] = {3,2,8,7,5,4};
        //System.out.print("Tamanho do vetor"+ v.length); para usar o length de forma mais inteligente:
        
        for(int c=0; c<=v.length-1; c++){
           // System.out.print(v[c] + "-" );
            System.out.println("Na posição: " +c+ "temos o valor: " +v[c]);

        }

        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = { 31, 28,31,30,31,30,31,31,30,31,30,31};
            for (int c=0;c<mes.length;c++){


                    System.out.println(mes[c]+"tem"+tot[c]+"dias");



            }
            




        }

    }

