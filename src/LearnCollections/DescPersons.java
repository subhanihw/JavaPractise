package LearnCollections;

import java.util.Comparator;

public class DescPersons implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
