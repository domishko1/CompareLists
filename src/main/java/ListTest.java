import java.util.List;
import java.util.Random;

public class ListTest {
    private IListFactory listFactory;

    private final Random random = new Random();

    public ListTest(IListFactory listFactory) {
        this.listFactory = listFactory;
    }

    private void setList(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
    }

    public double testAddElementFirst(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testAddElement(size, 0);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testAddElementMiddle(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testAddElement(size, size/2);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testAddElementEnd(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testAddElement(size, size - 1);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testDeleteElementFirst(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testDeleteElement(size, 0);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testDeleteElementMiddle(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testDeleteElement(size, size/2);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testDeleteElementEnd(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testDeleteElement(size, size - 1);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testGetElementFirst(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testGetElement(size, 0);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testGetElementMiddle(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testGetElement(size, size/2);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    public double testGetElementEnd(int size, int quantityOfTests){
        long sumOfTime = 0;
        for (int testId = 0; testId < quantityOfTests; testId++) {
            sumOfTime += testGetElement(size, size - 1);
        }

        return sumOfTime / (double) quantityOfTests;

    }

    private long testAddElement(int size, int numIdElement) {
        if (size <= numIdElement) {
            System.out.println("Index of the element is bigger that you have!");
            return 0;
        }
        else{
            long start, end;
            List list = listFactory.createList();
            setList(list, size);

            start = System.currentTimeMillis();
            list.add(numIdElement, random.nextInt());
            end = System.currentTimeMillis();

            return end - start;
        }
    }

    private long testDeleteElement(int size, int numIdElement) {
        if (size <= numIdElement) {
            System.out.println("Index of the element is bigger that you have!");
            return 0;
        }
        else {
            long start, end;
            List list = listFactory.createList();
            setList(list, size);

            start = System.currentTimeMillis();
            list.remove(numIdElement);
            end = System.currentTimeMillis();

            return end - start;
        }
    }

    private long testGetElement(int size, int numIdElement) {
        if (size <= numIdElement) {
            System.out.println("Index of the element is bigger that you have!");
            return 0;
        }
        else {
            long start, end;
            List list = listFactory.createList();
            setList(list, size);

            start = System.currentTimeMillis();
            list.get(numIdElement);
            end = System.currentTimeMillis();

            return end - start;
        }
    }
}
