package datastrcture.session2;


public class Day02CustomArrayTest {
public static void main(String[] args) {
    CustomArray customArray = new CustomArray();
    customArray.add(1);
    int x = customArray.get(0);
    System.out.println(x);
    customArray.add(2);
    x = customArray.get(1);
    System.out.println(x);
    customArray.add(3);
    x = customArray.get(2);
    System.out.println(x);
    System.out.println("the size " + customArray.size());

    customArray.deleteByIndex(1);
    System.out.println("the size after delete " + customArray.size());

    x = customArray.get(1);
    System.out.println("the value after delete " + x);
}
}
