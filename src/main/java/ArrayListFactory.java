import java.util.List;
import java.util.ArrayList;

public class ArrayListFactory implements IListFactory {

    public List<Integer> createList() {
        return new ArrayList<Integer>();
    }
}
