2. public class BMExercio02 {
    public static void main(String[] args) {
    int i = 1;
    long j = 2l;
    float p = 20.0f;
    double q = 30;
    boolean b = true;
    char c = 'k';
    System.out.println("O valor de i eh " + i + ", o valor de j eh " + j + ", o valor de p eh " + p +
  ", o valor de q eh " + q + ", o de b eh " + b  + "e o de c eh " + c);
      }
  } 
  
  3. public class BMExercicio3 {
    public static void main(String[] args) {
      float item1 = 2.95f, item2 = 3.5f;
      float custoTotal = item1 + item2;
      System.out.println("O item 1 custa " + item1 + " reais e o item 2 custa " + item2 + " reais. O total da compra foi de " + custoTotal + " reais.");
  
      final float taxa = 0.0825f;
      float taxaCalculada = custoTotal + (custoTotal * taxa);
      System.out.println("Com o acrescimo da taxa de " + (taxa * 100) + "%, o valor a ser pago e de " + taxaCalculada + " reais.");
  
      float novoCusto = (item1 * taxa) + (item2 * taxa);
      boolean muitoCaro = novoCusto > 10;
      System.out.println("A compra e muito cara? " + muitoCaro);
    }
  }

  4. public class BMExercio04 {
    public static void main(String[] args) {
    long long1 = 100l;
    int int1 = 200;
    int int2;
    int2 = (int)long1+ int1; 
    println("O valor de int 2 eh" + int2); 
    }
  }