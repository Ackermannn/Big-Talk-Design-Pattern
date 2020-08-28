package neu.edu.design_pattern.Iterator;

/**
 * 现代语言已经把这个迭代器模式内置到语言了
 * <p>
 * People类是Person的聚合，PeopleIterator是People的迭代器，该迭代器implement了Iterator
 * Person implement 了 Iterator
 */
public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.add(new Person("诸葛亮"));
        people.add(new Person("曹操"));
        people.add(new Person("王司徒"));
        for (Person x : people) {
            System.out.println(x);
        }
    }
}
