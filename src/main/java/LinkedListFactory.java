import java.util.List;
import java.util.LinkedList;

public class LinkedListFactory implements IListFactory {

    public List<Integer> createList(){
        return new LinkedList<Integer>();
    }
}
