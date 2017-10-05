package HomeWork6.MyExceptions;

import javax.xml.bind.DataBindingException;

public class TestException implements MyInterface {


    @Override
    public void getName() {
        try {
            System.out.println("Vlad");

        }catch (DataBindingException e){
            e.printStackTrace();
        }
    }

    @Override
    public void getSurname() {
        try{
            System.out.println("Kaverdiy");
            throw  new MyException();
        }catch (MyException ex){

        }catch (MyRuntimeException x){
            x.printStackTrace();
        }

    }
}
