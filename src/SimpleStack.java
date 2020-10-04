
public class SimpleStack {
	public static String[] str;
	public static int size;
	
	public SimpleStack() {
		str = new String[0];
		size = 0;
	}
	
	public boolean empty() {
		return (size == 0) ? true : false;
	}
	
	public String peek() {
		if (size == 0) {
			throw new IndexOutOfBoundsException("Index " + size + " out of bounds for length " + size);
		} else {
			return str[size-1];
		}
	}
	public String pop() {
		String removed = str[size-1];
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		} else {
			str[size-1] = null;
			size--;
			return removed;
		}
	}
	public void push(String s) {
		if (str.length == size) {
			String[] temp = new String[size + 10];
			for(int i = 0; i < size; i++) {
				temp[i] = str[i];
			}
			str = temp;
		}
		size ++;
		str[size-1] = s;
	}
	public int search(String s) {
		for (int i = 0; i < size; i++) {
			if (str[i] == s) return size-i;
		}
		return -1;
	}
	
	public String toString() {
		String concat = "[";
		for (int i = 0; i < size - 1; i++) {
			concat += str[i] + ", ";
		}
		concat += (size != 0) ? str[size - 1] + "]" : "]" ;
		return concat;
	}
}