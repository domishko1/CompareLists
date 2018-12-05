import java.util.Scanner;

public class Tester {
    private ListTest firstListFactory;
    private ListTest secondListFactory;

    Tester(ListTest first, ListTest second) {
        firstListFactory = first;
        secondListFactory = second;
    }

    private double compareOfAddingArrayListFirst(int size, int quantityOfTests) {
        return firstListFactory.testAddElementFirst(size, quantityOfTests) - secondListFactory.testAddElementFirst(size, quantityOfTests);
    }

    private double compareOfAddingArrayListMiddle(int size, int quantityOfTests) {
        return firstListFactory.testAddElementMiddle(size, quantityOfTests) - secondListFactory.testAddElementMiddle(size, quantityOfTests);
    }

    private double compareOfAddingArrayListEnd(int size, int quantityOfTests) {
        return firstListFactory.testAddElementEnd(size, quantityOfTests) - secondListFactory.testAddElementEnd(size, quantityOfTests);
    }

    private double compareOfDeletingArrayListFirst(int size, int quantityOfTests) {
        return firstListFactory.testDeleteElementFirst(size, quantityOfTests) - secondListFactory.testDeleteElementFirst(size, quantityOfTests);
    }

    private double compareOfDeletingArrayListMiddle(int size, int quantityOfTests) {
        return firstListFactory.testDeleteElementMiddle(size, quantityOfTests) - secondListFactory.testDeleteElementMiddle(size, quantityOfTests);
    }

    private double compareOfDeletingArrayListEnd(int size, int quantityOfTests) {
        return firstListFactory.testDeleteElementEnd(size, quantityOfTests) - secondListFactory.testDeleteElementEnd(size, quantityOfTests);
    }

    private double compareOfGettingArrayListFirst(int size, int quantityOfTests) {
        return firstListFactory.testGetElementFirst(size, quantityOfTests) - secondListFactory.testGetElementFirst(size, quantityOfTests);
    }

    private double compareOfGettingArrayListMiddle(int size, int quantityOfTests) {
        return firstListFactory.testGetElementMiddle(size, quantityOfTests) - secondListFactory.testGetElementMiddle(size, quantityOfTests);
    }

    private double compareOfGettingArrayListEnd(int size, int quantityOfTests) {
        return firstListFactory.testGetElementEnd(size, quantityOfTests) - secondListFactory.testGetElementEnd(size, quantityOfTests);
    }

    private int getNum() {
        Scanner sc = new Scanner(System.in);;
        int num = sc.nextInt();
        while(num <= 0) {
            System.out.println("It should be a positive number!");
            num = sc.nextInt();
        }

        return num;
    }

    public double compareOfAdding() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int size = getNum();
        System.out.println("Enter the quantity of tests: ");
        int quantityOfTests = getNum();

        System.out.println("Where do you want to test of adding your element?");
        System.out.println("1 - First");
        System.out.println("2 - Middle");
        System.out.println("3 - End");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                return compareOfAddingArrayListFirst(size, quantityOfTests);
            case 2:
                return compareOfAddingArrayListMiddle(size, quantityOfTests);
            case 3:
                return compareOfAddingArrayListEnd(size, quantityOfTests);
            default:
                System.out.println("Error!");
        }
        return 0;
    }

    public double compareOfDeleting() {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter the size of list: ");
        int size = getNum();
        System.out.println("Enter the quantity of tests: ");
        int quantityOfTests = getNum();

        System.out.println("Where do you want to test of deleting your element?");
        System.out.println("1 - First");
        System.out.println("2 - Middle");
        System.out.println("3 - End");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                return compareOfDeletingArrayListFirst(size, quantityOfTests);
            case 2:
                return compareOfDeletingArrayListMiddle(size, quantityOfTests);
            case 3:
                return compareOfDeletingArrayListEnd(size, quantityOfTests);
            default:
                System.out.println("Error!");
        }
        return 0;
    }

    public double compareOfGetting() {
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter the size of list: ");
        int size = getNum();
        System.out.println("Enter the quantity of tests: ");
        int quantityOfTests = getNum();

        System.out.println("Where do you want to test of getting your element?");
        System.out.println("1 - First");
        System.out.println("2 - Middle");
        System.out.println("3 - End");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                return compareOfGettingArrayListFirst(size, quantityOfTests);
            case 2:
                return compareOfGettingArrayListMiddle(size, quantityOfTests);
            case 3:
                return compareOfGettingArrayListEnd(size, quantityOfTests);
            default:
                System.out.println("Error!");
        }
        return 0;
    }
}


