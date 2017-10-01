package HomeWork3;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyListImpl implements MyList<Person> {

    private Person[] arr = new Person[1];


    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return arr.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        if(o instanceof Person){
            for(Person a: arr){
                if(a.equals(o)){
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    @Override
    public Iterator<Person> iterator() {

        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {

        return arr;
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return null;
    }

    @Override
    public boolean add(Person person) {


        return true;
    }



    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Person> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection<? extends Person> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Person get(int index) {
        return null;
    }


    @Override
    public Person set(int index, Person element) {
        return null;
    }

    @Override
    public void add(int index, Person element) {

    }

    @Override
    public Person remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @NotNull
    @Override
    public ListIterator<Person> listIterator() {
        return null;
    }

    @NotNull
    @Override
    public ListIterator<Person> listIterator(int index) {
        return null;
    }

    @NotNull
    @Override
    public List<Person> subList(int fromIndex, int toIndex) {
        return null;
    }
}
