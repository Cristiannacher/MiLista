package List;

import Exeptions.ObjectNotFoundException;
import List.Element;

public class LinkedList {

    private Element firstElement;

    public LinkedList() {
        this.firstElement = null;
    }

    public void insertFirst(Object obj) {
            Element newElement = new Element(obj);
            newElement.setNext(firstElement);
            firstElement = newElement;
    }

    public void insert(Object object) {
        Element newElement = firstElement;
        if (firstElement == null) {
            firstElement = new Element(object);
        } else {
            while (newElement.getNext() != null) {
                newElement = newElement.getNext();
            }
            newElement.setNext(new Element(object));
        }
    }

    public void print() {
        Element toGetObject = firstElement;

        if (firstElement != null) {
            do {
                System.out.print(toGetObject.getObjet() + " ");
                toGetObject = toGetObject.getNext();
            } while (toGetObject.getNext() != null);
        } else System.out.println();
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void remove(Object obj) throws ObjectNotFoundException {
        Element toGetObject = firstElement;

        if (firstElement != null) {
            do {
                if (toGetObject.getObjet().equals(obj)) {
                    Element newElement = new Element(obj);
                    newElement.setNext(toGetObject.getNext());

                }
            } while (firstElement.getNext() != null);
        } else System.out.println(); // poner que lance la excepcion
    }
}


}
