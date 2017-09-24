package Home.Work2;

public class Sum {

    private static int inputNumber = 78531;
    private static int sum = 0;

    public int getSumAllNumbers(){

   int x = inputNumber;
        while(inputNumber!= 0){
            sum = sum + inputNumber%10;
            inputNumber = inputNumber/10;
        }

        System.out.println("The sum of the arguments " + x +" = " + sum);


        return 0;
    }
}
