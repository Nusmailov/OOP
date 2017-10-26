package Problem3;

public class MyVector extends MyCollection{
	private Integer[] a = new Integer[100];
	private int size;
	public MyVector() {
		size = 0;
	}
	@Override
	public void add(int element) {
		a[size++] = element;
	}

	@Override
	public void add(int index, int element) {
		if(index < size + 1) {
			a[index] = element;
			size++;
		}
	}

	@Override
	public void clear() {
		for(int i = 0;i < size; ++i) {
			a[i] = null;
		}
		size = 0;
	}

	@Override
	public boolean contains(int b) {
		return indexOf(b)!=0;
	}

	@Override
	public int get(int index) {
		return a[index];
	}

	@Override
	public int indexOf(int o) {
		for(int i = 0; i < size;i++) {
			if(a[i]== o) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void insertElementAt(int index, int element) {
		if(index < size) {
			int  k = size;
			for(int i = size + 1;i >= index + 1; i--) {
				a[i] = a[k];
				k--;
			}
			a[index] = element;
		}
	}

	@Override
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void removeAt(int index) {
		if(index < size) {
			for (int i = index; i < size;i++) {
				a[i] = a[i + 1];
				
			}
			a[size] = null;
			size--;
		}
		
	}

	@Override
	public void remove(int element) {
		for (int i = 0; i < size; i++) {
			if(a[i] == element) {
				for(int j = i; j < size; j++)
					a[j] = a[j+1];
				a[size]=null;
				size--;
				return;
			}
		}
	}

	@Override
	public void removeAll(int element) {
		for(int i=0; i<size; ++i){
			if(a[i] == element){
				for(int j = 0; j < size; ++j)
					a[j] = a[j + 1];
				a[size] = null;
				size--;
				removeAll(element);
			}
		}
		return;
	}

	@Override
	public void reverse() {
		for(int i = 0;i < size / 2; i++) {
			swap(a[i], a[size - i]);
		}
	}

	private void swap(Integer integer, Integer integer2) {
		int temp = integer;
		integer = integer2;
		integer2 = temp;
	}
	
	@Override
	public void set(int index, int element) {
		// TODO Auto-generated method stub
		if(index <= size) a[index] = element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void sort() {
		for(int i = 0;i < size - 1;i++) {
			for(int j = 0;j < size - i - 1;j++) {
				if (a[j] > a[j+1])
		              swap(a[j], a[j+1]);
			}
		}
	}

	@Override
	public int[] toArray() {
		int[] b = new int[size];
		for (int i = 0; i < size; ++i)
			b[i] = a[i];
		return b;
	}

	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < size; ++i){
			if(a[i] != null){
				s += a[i];
				if(a[i + 1] != null)
					s += ", ";
			}
		}
		return s;
	}
}
