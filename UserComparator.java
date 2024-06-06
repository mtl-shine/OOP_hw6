import java.util.Comparator;

public class UserComparator <T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareToIgnoreCase(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            } else {
                return resultOfComparing;
            } 
        } else {
            return resultOfComparing;
        }
    }
    
}
