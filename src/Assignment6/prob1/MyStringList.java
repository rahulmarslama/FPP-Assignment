package Assignment6.prob1;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	//1.
	public int indexOf(String s)
	{
		if(isEmpty()) return -1;
		if(s == null) return -1;

		for(int i=0;i<size();i++)
		{
			if(s.equals(strArray[i]))
			{
				return i;
			}
		}
		return -1;
	}

	//2.
	public String removeAt(int index)
	{
		if(isEmpty()) return null;
		if(index < 0 || index >= size()) return null;

		String deletedValue = strArray[index];
		for (int i=index; i< size();i++)
		{
			strArray[i] = strArray[i+1];
		}
		return deletedValue;
	}

	//3.
	public void clear()
	{
		if(isEmpty()) return;
		for (int i = 0;i< size();i++)
		{
			strArray[i] = null;
		}
		size = 0;
	}

	//4.
	public String set(int index, String s)
	{
		if(isEmpty()) return null;
		if(index>= size()) return null;
		if(s == null) return null;

		String oldValue = strArray[index];
		strArray[index] = s;
		return oldValue;

	}

	//5.
	public boolean containsAll(MyStringList other)
	{
		if(isEmpty()) return false;
		if(other.isEmpty()) return  false;

		boolean flag = false;
		for (int i=0;i<other.size();i++)
		{
			for(int j=0;j<size;j++)
			{
				if(other.strArray[i].equals(strArray[j]))
				{
					flag = true;
					break;
				}
				flag = false;

			}
		}

		return flag;
	}

	//6.
	public MyStringList subList(int start, int end)
	{
		if(isEmpty()) return null;
		if(start < 0 || end > size() || start > end) return null;
		MyStringList stringList = new MyStringList();
		stringList.strArray = Arrays.copyOfRange(this.strArray,start,end);
		stringList.size = end - start;

		return stringList;
	}

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}

	/* 1. Using System.arrayopy()
	  public void insert(String s, int pos){
	     if(pos > size-1 || pos<0 )
	         return;//allowed to add 0 to size-1
	  if(s==null) return;
	  if(pos == strArray.length) {
	      resize();
	   }
	  String[] temp = new String[strArray.length];
	   System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
	    temp[pos] = s;
	  System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

	  strArray = temp;
	  ++size;
	   }
	 */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
	// can insert the elements 0 to size position
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));

		//1.indexof()
		System.out.println(l);
		System.out.println(l.indexOf("Mohanraj"));

		//2. removeAt()
		System.out.println(l.removeAt(5));
		System.out.println(l);
		System.out.println(l.size());

		//3.clear()
//		l.clear();
//		System.out.println(l.size());

		//4. set()
		System.out.println(l.set(0,"Tashi"));
		System.out.println(l);

		//5. containsAll()
		MyStringList other = new MyStringList();
		other.add("Tashi");
		other.add("Richard");
		other.add("Susan");

		System.out.println(l.containsAll(other));

		//6.
		System.out.println(l.subList(1,4));
	}
}
