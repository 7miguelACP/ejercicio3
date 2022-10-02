class Main {
    public static void main(String[] args) {
      //primer ejercio suma de 3 numeros con funcion
      System.out.println("\nPrimer ejercicio :");
      int numero1= 5;
      int numero2= 15;
      int numero3= 23;
      
      int total=suma(numero1,numero2,numero3);
      System.out.print("\n numeros ingresados "+ numero1 +","+ numero2 +","+ numero3 +"");
      System.out.print("\n La suma de los tres numeros es :"+ total);
  
      // 2 ejercicio class carro
      System.out.println("\n");
      System.out.println("\nSegundo ejercicio :\n");
      Coche coche1=new Coche();
      coche1.setPuertas(0);
      System.out.println("numero de puertas del coche :"+coche1.getPuerta());
      System.out.println("agregamos una puerta \ntotal numero de puertas "+coche1.agregar_puerta());
  }
  //funcion para el ejercicio 1
  public static int suma(int n1,int n2,int n3){
    int resultado;
    resultado= n1+ n2 + n3;
    return resultado;
  }
  }
  
  class Coche{
      private String color;
      private int  placa;
      private int puertas;
    
    public void setPuertas(int puertas){
      this.puertas=puertas;
    }
    public int getPuerta(){
      return this.puertas;
    }
    public int agregar_puerta(){
        return puertas + 1 ;
    }
    
  }