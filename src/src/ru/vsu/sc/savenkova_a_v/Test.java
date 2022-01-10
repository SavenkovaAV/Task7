package src.ru.vsu.sc.savenkova_a_v;

public class Test {
    public TestResult test() {
        TestArrays testArrays = new TestArrays();
        TestCase[] array = testArrays.getTestArrays();

        for (int i = 0; i < array.length; i++) {
            int obtainedResult = SumOfNumbersBetweenLastEvenAndOddNumbers.findSumOfNumbersBetweenLastEvenAndOddNumbers(array[i].getArrayForTest());

            if (obtainedResult != array[i].getResult()) {
                System.out.print("Error in the test ");
                System.out.println(i + 1);
                return new TestResult(false);
            }
        }
        return new TestResult(true);
    }
}
