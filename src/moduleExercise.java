public class moduleExercise {

    static final Integer DIVISOR = 3;

    public static void main(String[] args) {
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Integer total = 0;

        for (int i = 0; i < numeros.length; i++) {
            total = total + numeros[i];
            //System.out.println(total);

            Integer modulo = total % DIVISOR;
            if (modulo.equals(0)) {
                System.out.println("The following number " + total + " by 3");
            }
        }

    }

}
