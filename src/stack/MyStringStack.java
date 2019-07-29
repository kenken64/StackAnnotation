package stack;


import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * <p>A <strong>MyStringStack</strong> </p>
 * is a class  that implements a simple (LIFO) stack object. It makes use of the Vector {@link java.util.Vector}
 * <p>It has four basic operations:
 *      <code>push()</code> to push an element onto the stack
 *      <code>pop()</code> to retrieve the last pushed element
 *      <code>isEmpty()</code> to verify whether the stack has no more elements
 *      <code>clear()</code> to empty the stack.
 * </p>
 * @author Swarnalatha Ashok
 * @version 1.0  2008-07-16
 * @since JDK 1.5
 */
public class MyStringStack {
    private Vector<String> v = new Vector<String> ();
    public void push (String newElement) {
        if (newElement != null) v.add (newElement);
    }

/**
     * Returns a String object that was pushed the last on the stack.
     * <p>This method always returns a valid String. </p>
     * <p>If there is no element it throws a NoSuchElementException exception.</p>
     *
     * @return      the String on top of the stack
     * @throws      NoSuchElementException if there are no elements on the stack
     * @see         String
     */
    public String pop() throws NoSuchElementException {
    	//throw new NoSuchElementException();
    	String result = v.lastElement();
    	v.remove(result);
    	System.out.println("hello");
    	return result;

        //return v.lastElement();
    }
    public boolean isEmpty() {
        return v.isEmpty();
    }
    public void clear() {
        v = new Vector<String> ();
    }
}