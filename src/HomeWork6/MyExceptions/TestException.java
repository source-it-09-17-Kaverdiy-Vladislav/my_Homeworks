package HomeWork6.MyExceptions;

import javax.xml.bind.DataBindingException;

public class TestException implements MyInterface {


    @Override
    public void getName() {
        try {

        }catch (DataBindingException e){
            e.printStackTrace();
        }
    }

    @Override
    public void getSurname() {
        try{
            throw  new MyException();
        }catch (MyException ex){

        }catch (MyRuntimeException x){
            x.printStackTrace();
        }

    }
}
