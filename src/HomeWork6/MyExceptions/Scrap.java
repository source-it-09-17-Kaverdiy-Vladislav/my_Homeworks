package HomeWork6.MyExceptions;


import com.sun.nio.sctp.IllegalReceiveException;

public class Scrap {


    public static int getMass(int[] arr, int index) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == index)
                    return i;
            }
            return -1;

        } catch(MyRuntimeException e){
            e.printStackTrace();
            try{
                throw new MyException();

            } catch(MyException k){
            k.printStackTrace();
        }
        return index;
    }
    }


    public static Integer valueOf(int i){
        return i;
    }


   public static Object toString(String []mas, double decimal)  {
       try {
           for (int i = 0; i < mas.length; i++) {
               if (mas[i] == " ")
                   return decimal;
           }

       }catch(IllegalReceiveException i){
           i.printStackTrace();
       }finally {
           try {
               throw new MyException();
           } catch (MyException e) {
               e.printStackTrace();
           }

       }
       return null;
   }
}
