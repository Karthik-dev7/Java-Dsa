package Learning;

import java.util.ArrayList;

public class DynamicArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        for (int i = 1; i <= 15; i++) {
            list.add(i);
            System.out.println("Added: " + i + ", Size: " + list.size() + ", Capacity (approx): " + getCapacity(list));
        }

        // Removing elements from the ArrayList
        for (int i = 15; i >= 1; i--) {
            list.remove(list.size() - 1); // Remove last element
            System.out.println("Removed: " + i + ", Size: " + list.size() + ", Capacity (approx): " + getCapacity(list));
        }
    }
//
    // Reflection to get ArrayList capacity (Java-specific, for demonstration only)
    private static int getCapacity(ArrayList<?> list) {
        try {
            java.lang.reflect.Field dataField = ArrayList.class.getDeclaredField("elementData");
            dataField.setAccessible(true);
            Object[] elementData = (Object[]) dataField.get(list);
            return elementData.length;
        } catch (Exception e) {
            return -1; // Unable to determine capacity
        }
    }
}
