public class Calculate {
      public static void main(String[] arg) {
             System.out.println("Calculate...");
             int first = Integer.valueOf(arg[0]);
             int second = Integer.valueOf(arg[1]);
             int summ = first + second;
             int raz = first - second;
             double delen = first / second;
             int umnoj = first * second;
             double stepen = Math.pow(first,second);
             System.out.println("Summa " + summ);
             System.out.println("Raznost " + raz); 
             System.out.println("Delenie " + delen);
             System.out.println("Proizvedenie " + umnoj); 
             System.out.println("Stepen' " + stepen); 

  }
}