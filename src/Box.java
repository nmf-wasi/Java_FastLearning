public class Box <T>{
    // we dont know the datatype, so we have to be careful
    T item;
    public void setItem(T item){
        this.item=item;
    }

    public T getItem() {
        return item;
    }
}
