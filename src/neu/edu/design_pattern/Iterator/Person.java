package neu.edu.design_pattern.Iterator;

public class Person {
    private String Name;

    public Person(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString(){
        return Name;
    }

}
