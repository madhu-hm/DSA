package dsaAssg;

public class ArrayList<E> {
	private static final int DEFAULT_CAPACITY=10;
	private Object[] elements;
	private int size;
	
	public ArrayList() {
		this.elements=new Object[DEFAULT_CAPACITY];
		this.size=0;
	}
	
	public ArrayList(int initialCapacity) {
		if(initialCapacity<=0) {
			throw new IllegalArgumentException("Initial capacity must be positive");
		}
		this.elements=new Object[initialCapacity];
		System.out.println(elements.length);
		this.size=0;
	}
	
	// To add element to the end of the list
	public void add(E element) {
		ensureCapacity(size+1);
		elements[size++]=element;
	}
	
	// To get element at specific index
	public E get(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
		}
		return (E) elements[index];
	}
	
	// To remove element at specific index
	public E remove(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("Index: "+index+", Size:"+size);
		}
		E removedElement=(E)elements[index];
		
		// Shift elements to the left
		int numToMove=size-index-1;
		if(numToMove>0) {
			System.arraycopy(elements,index+1,elements,index,numToMove);
		}
		elements[--size]=null;
		return removedElement;
	}
	
	// To get current size of the list
	public int size() {
		return size;
	}
	
	private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
            System.out.println("NEW ARRAY");
            System.out.println(newElements);
        }
    }
	
	public boolean contains(E o) {
		 for (int i = 0; i < size; i++) {
			 if (o.equals(elements[i])) {
				 return true;
	         }
	      }
	      return false;
	}
	 
	@Override
	public String toString() {
	    if (size == 0) {
	        return "[]";
	    }
	    
	    StringBuilder sb = new StringBuilder("[");
	    for (int i = 0; i < size; i++) {
	        sb.append(elements[i]);
	        if (i < size - 1) {
	            sb.append(", ");
	        }
	    }
	    sb.append("]");
	    return sb.toString();
	}

}
