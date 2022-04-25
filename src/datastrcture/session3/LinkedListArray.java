package datastrcture.session3;

public class LinkedListArray {
    //the nodes of the linkedlist
    private class Container {
        Container next; //pointer
        String value; //data
    }

    private Container start, end;
    private int size;

    public void addToFront(String value) {
        Container newNode = new Container();
        newNode.value = value;

        //size = 0
        if(size == 0){
            start = newNode;
            end = newNode;
            size++;
        }
        else{
            //size > 0
            newNode.next = start; // pointing to the ex-first element
            start = newNode;
            size++;
        }

    }

    public void addToEnd(String value) {
        //TODO : for YOU !!!
        Container newNode = new Container();
        newNode.value = value;
        if(size == 0){
            start = newNode;
            end = newNode;
            size++;
        }
        else{
            end.next = newNode;
            end = newNode;
            size++;
        }
    }

    public String get(int index) {
        //check the index => index out of bound
        if(index < 0 || index >= size)
            return null;
        //if index = size - 1
         if(index == size - 1)
            return end.value;
        //if index = 0
        // return start.value
        if(index == 0)
            return start.value;
        //using while loop
        //TODO : for YOU!!!
        while (index > 0){
            start = start.next; // move to the next element
        }
        return  "";
    }
    public void insertValueAtIndex(int index, String value) {
        //by using NEXT

        //check the index => index out of bound
                if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();

         if(size ==0 || index == size){
            this.addToEnd(value);
        //if index = 0
        // return start.value
        if(index == 0)
            addToFront(value);
        //find the container just before the position

       Container before = start;
       for(int i = 0; i < index - 1; i++){
           before = before.next;
       }
       Container newNode = new Container();
       newNode.value = value;

       newNode.next = before.next;
       before.next = newNode;
       size++;
       return;
    }

    public void deleteByIndex(int index) {
                 //check the index => index out of bound
                if(index < 0 || index >= size) {
                    throw new IndexOutOfBoundsException();
                }

                if(index == 0){
                    start = start.next;
                    size--;
                    return;
                }
                Container before = start;
                for(int i = 0; i < index - 1; i++){
                    before = before.next;
                }

                //for removing the last element
                if(index == size - 1){
                    end = before;
                }
                before.next = before.next.next;
                size--;

    }
    public boolean deleteByValue(String value) {
            Container current = start;
            int counter = 0;
             while(current != null){
                 if(current.value.equals(value)){
                     deleteByIndex(current.value);
                     return true;
                 }
                 counter ++;
                 current = current.next;
             }
             return false;
        }} // delete first value found
    public int getSize() { return size; }

    @Override
    public String toString() {
        Container curr = start;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (curr !=null){
            builder.append(curr == start ? "" : ",");
            builder.append(curr.value);
            curr = curr.next;
        }
        builder.append("]");
        return builder.toString();
    } // comma-separated values list similar to: [5,8,11]

    public String[] toArray() { return null;} // could be used for Unit testing

}
