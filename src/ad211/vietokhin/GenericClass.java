package ad211.vietokhin;

import java.util.ArrayDeque;

class GenericClass<D> {
    private ArrayDeque<D> deque = new ArrayDeque<>();

    public ArrayDeque<D> getDeque() {
        return deque;
    }

    public void setDeque(ArrayDeque<D> deque) {
        this.deque = deque;
    }

    public void addElement(D element) {
        deque.add(element);
    }

    public void deleteElement() {
        if (deque.isEmpty()) {
            System.out.println("\nList is empty");
            return;
        }
        deque.removeFirst();
    }

    public void outputElements() {
        System.out.println("\nList: ");
        for(D element : deque) {
            System.out.println(element + " ");
        }
    }
}
