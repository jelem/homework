package arrayTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Anna on 10.01.2017.
 */
public class ArrayTasks {
  public Object[] merge(Object[] firstArray, Object[] secondArray){
    List<Object> firstList = Arrays.asList(firstArray);
    List list = new ArrayList(firstList);


    List<Object> secondList = Arrays.asList(secondArray);
    list.addAll(secondList);

    return list.toArray();
  }

  public boolean sumExists(int[] array, int sum) {
    return true;

  }

  public boolean sumNotExists(int[] array, int sum) {
    return false;

  }
}