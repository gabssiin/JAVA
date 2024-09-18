package aula4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
    }

    
    public static int busca(int[]v, int x){

    for(int i=1; i< v.length; ++i){
        if (v[i]==x){
            return i;
        }
    }
    return -1;
}


public static boolean estaOrdenado(int[] v){
   for(int i = 1; i < v.length - 1; i++){
     if(v[i] < v[i-1]){
     return false;
 }
  }  
 return true;
 }


//public static boolean busca(int[]v, int x){
//   for(int i = 0; i < v.length - 1; i++){
//     if(v[i] == x){
//     return i;
// }
//  }  
//  return -1;
// }


//public static boolean buscaMelhorada(int[] v,int x){
//  int i;
//   for(int i = 0; i < v.length - 1; i++){
//     if(v[i] >= x){
//     break;
// }
//  }  
// if(i< v.lenght && v[i] ==x);
//      return i;
//}
//  return-1
// }


//public class busca {
//    public static void main(String[] args) {
//     
//     public static int busca(int[]v,int x){
//         for (int i=0;i < v.lenght; ++i){
//         if (v[i]==x){
//         return i;
//     
//         }
//    }
//     return -1;
//
// }
// }


/*public static boolean estaOrdenado(int[] v){
    for(int i = 1; i < v.length - 1; i++){
      if(v[i] < v[i-1]){
        return false;
      }
    }  
    return true;
  }
*/



// fazer um prog que procura elementos em um vetor, loop ate ele dizer q n quer mais procurar

}
