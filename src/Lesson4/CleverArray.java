package Lesson4;

public class CleverArray {
    int dimension = 7;
    public int freeElements = 0;
    public int occupiedElements = dimension;
    Object[] mass = new Object[dimension];

//    public CleverArray() {
//        Object[] mass = new Object[dimension];
//    }

    public void add(int element) {
        if (freeElements < 1){
            newSize(mass.length*2, freeElements);
            mass[dimension++] = element;
            occupiedElements++;
            freeElements = mass.length*2 - occupiedElements;
        }
    }

    public void newSize(int newLength, int freeElements){
        Object newArray[] = new Object[newLength];
        for (int i = 0; i <= freeElements - 1; i++) {
            newArray[i] = i ;
        }

    }
    public void remove(int ind){
        for (int i = ind; i<mass.length-1; i++)
            mass[i] = mass[i++];
        freeElements++;
        occupiedElements--;
        if (mass.length / freeElements >= 2) {
            newSize(mass.length / 2, freeElements);
            freeElements = mass.length/2 - occupiedElements;
        }
    }
}
