package List;

public class Element {

    private Object object;
    private Element next;

    public Element(Object newObject){
        this.object = newObject;
    }

    public void setNext(Element newNext){
        this.next = newNext;
    }

    public Element getNext(){
        return next;
    }

    public Object getObjet(){
        return object;
    }

    public void setObject(Object newObject){
        this.object = newObject;
    }

    public void delete(){
        object = null;
        next = null;
    }

}
