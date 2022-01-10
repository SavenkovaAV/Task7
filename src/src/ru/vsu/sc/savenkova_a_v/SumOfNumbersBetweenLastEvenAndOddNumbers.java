package src.ru.vsu.sc.savenkova_a_v;

public class SumOfNumbersBetweenLastEvenAndOddNumbers {
    public static int findSumOfNumbersBetweenLastEvenAndOddNumbers(int[] arr) {
        int indexLastEvenNumber = findIndexLastEvenOrOddNumber(arr, 0);
        int indexLastOddNumber = findIndexLastEvenOrOddNumber(arr, 1);
        int sum = 0;
        if ((indexLastEvenNumber == -1) || (indexLastOddNumber == -1)) {
            return 0;
        } else if (Math.abs(indexLastEvenNumber - indexLastOddNumber) <= 1) {
            return 0;
        } else if (indexLastEvenNumber > indexLastOddNumber) {
            for (int i = indexLastOddNumber + 1; i <= indexLastEvenNumber; i++) {
                sum += arr[i];
            }
        } else if (indexLastEvenNumber < indexLastOddNumber) {
            for (int i = indexLastEvenNumber + 1; i <= indexLastOddNumber; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int findIndexLastEvenOrOddNumber(int[] arr, int indicatorOfParity) {
        int indexLastEvenNumber = 0;
        int indexLastOddNumber = 0;
        int quantityOfEvenNumbers = 0;
        int quantityOfOddNumbers = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] % 2 == 0) && (arr[i] != 0)) {
                indexLastEvenNumber = i;
                quantityOfEvenNumbers += 1;
            } else if (arr[i] != 0) {
                indexLastOddNumber = i;
                quantityOfOddNumbers += 1;
            }
        }
        if (indicatorOfParity == 0) {
            if (quantityOfEvenNumbers != 0) {
                return indexLastEvenNumber;
            }
        } else if (quantityOfOddNumbers != 0) {
                return indexLastOddNumber;
            }
        return -1;
    }
}
