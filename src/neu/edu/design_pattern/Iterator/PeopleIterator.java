package neu.edu.design_pattern.Iterator;

import java.util.Iterator;

public class PeopleIterator implements Iterator<Person> {
    private People people;
    private int current = 0;

    PeopleIterator(People people) {
        this.people = people;
    }

    @Override
    public boolean hasNext() {
        return current < people.getSize();
    }

    //返回当前迭代元素 ，同时，迭代游标后移
    @Override
    public Person next() {
        if (hasNext()) {
            Person ret = people.getItem(current);
            current++;
            return ret;
        }
        else {
            System.out.println("指针到达尾部无法继续");
            return null;
        }
    }
}
