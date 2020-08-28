package neu.edu.design_pattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable<Person>{
    private ArrayList<Person> arr = new ArrayList<>();

    public void add(Person p){
        arr.add(p);
    }
    Person getItem(int i){
        return arr.get(i);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PeopleIterator(this);
    }
    int getSize(){
        return arr.size();
    }
}
