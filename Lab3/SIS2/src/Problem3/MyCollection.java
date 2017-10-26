package Problem3;

public abstract class MyCollection {
	public abstract void add(int element);
	public abstract void add(int index, int element);
	public abstract void clear();
	public abstract boolean contains(int b);
	public abstract int get(int index);
	public abstract int indexOf(int o);
	public abstract void insertElementAt(int index, int element);
	public abstract boolean isEmpty();
	public abstract void removeAt(int index);
	public abstract void remove(int element);
	public abstract void removeAll(int element);
	public abstract void reverse();
	public abstract void set(int index, int element);
	public abstract int size();
	public abstract void sort();
	public abstract int[] toArray();
	public abstract String toString();
}
