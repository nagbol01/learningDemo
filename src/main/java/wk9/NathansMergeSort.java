package wk9;

import java.util.ArrayList;
import java.util.Arrays;

public class NathansMergeSort {

  private static ArrayList<Integer> resultant = new ArrayList<Integer>();


  public static ArrayList<Integer> merge(ArrayList<Integer> first, ArrayList<Integer> second,
      ArrayList<Integer> resultant) {
    int firstIndex = 0;
    int secondIndex = 0;
    int resultantIndex = 0;

    while (firstIndex < first.size() && secondIndex < second.size()) {
      if (first.get(firstIndex) < second.get(secondIndex)) {
        resultant.set(resultantIndex, first.get(firstIndex));
        firstIndex++;
      } else {
        resultant.set(resultantIndex, second.get(secondIndex));
        secondIndex++;
      }
      resultantIndex++;
    }

    ArrayList<Integer> rest;
    int restIndex;
    if (firstIndex >= first.size()) {
      rest = second;
      restIndex = secondIndex;
    } else {
      rest = first;
      restIndex = firstIndex;
    }

    for (int i = restIndex; i < rest.size(); i++) {
      resultant.set(resultantIndex, rest.get(i));
      resultantIndex++;
    }

    return resultant;
  }


  public static void mergeSort(ArrayList<Integer> a) {

    if (a.size() <= 1) {
      resultant = a;
    }

    ArrayList<Integer> firstTemp = new ArrayList<Integer>(a.subList(0, a.size() / 2));
    ArrayList<Integer> secondTemp = new ArrayList<Integer>(a.subList(a.size() / 2, a.size()));

    mergeSort(firstTemp);
    mergeSort(secondTemp);

    merge(firstTemp, secondTemp, resultant);
  }

  public static void main(String[] args) {

    Integer[] temp = {13, 47, 200, 53, 0, 100, 33, 8, 31, 75, 123, 47, 99};

    ArrayList<Integer> tester = new ArrayList<Integer>(Arrays.asList(temp));
    mergeSort(tester);
  }
}

