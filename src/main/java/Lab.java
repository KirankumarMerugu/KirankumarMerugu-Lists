
import java.util.List;

/**
 * Lists are ordered collections. This means that we could access elements at a certain position of a list,
 * and lists are also allowed to contain duplicate values.
 *
 * We will be using lists quite a bit to store values. They will be the most common Collection we use, and you will
 * become familiar with them over time.
 */
import java.util.ArrayList;

public class Lab {

    /**
     * Instantiate and return a List of Integers.
     *
     * @return a List<Integer> object.
     */
    public List<Integer> createList() {
        return new ArrayList<>(); // Use ArrayList as the implementation of the List interface
    }

    /**
     * Get the size of a list.
     *
     * @param list a List<Integer> object.
     * @return the size of List (number of items it holds).
     */
    public int getSize(List<Integer> list) {
        return list.size(); // Use the size() method of List to get the number of elements
    }

    /**
     * Add an item to a list.
     *
     * @param list a List<Integer> object that we would like to modify.
     * @param value an integer that we would like to add to list.
     */
    public void addToList(List<Integer> list, int value) {
        list.add(value); // Add the value to the list using the add() method
    }

    /**
     * Get a particular index of a list.
     *
     * @param list a List<Integer> object that we would like to examine.
     * @param index represents the index of the element we would like to retrieve.
     * @return the int value at the location in 'list' represented by 'index'.
     */
    public int get(List<Integer> list, int index) {
        return list.get(index); // Retrieve the value at the specified index using get()
    }

    /**
     * Remove an index from a list.
     *
     * @param list a List<Integer> object that we would like to modify.
     * @param position represents the index of the element we would like to remove.
     */
    public void removeFromList(List<Integer> list, int position) {
        list.remove(position); // Remove the element at the specified index using remove()
    }

    /**
     * Update an index of a list.
     *
     * @param list a List<Integer> object that we would like to modify.
     * @param position represents the index of the element we would like to change.
     * @param value the new value which we would like to assign to the item at position in list
     */
    public void updateAtPosition(List<Integer> list, int position, int value) {
        list.set(position, value); // Update the value at the specified index using set()
    }
}
