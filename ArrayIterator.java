package integeriterators;

public class ArrayIterator implements IntegerIterator{
	
	private int[] array; //My array that will be iterated
	private int iteratorIndex; //The index that will point out where we are in the array, first position, second, etc
	private boolean circular;
	
	

	
public ArrayIterator(int[] ar) { //first constructor of this case, where we get an array of integers
	array = ar; 
	iteratorIndex= 0; 
	circular = false;
	
}; 

public ArrayIterator(int [] ar, boolean isCircular) {
	array = ar; 
	iteratorIndex= 0; 
	circular = isCircular; 
}; 




@Override
public Integer next() { //display the value we have, the element we are in
	// TODO Auto-generated method stub
			
	int valuetoDisplay= array[iteratorIndex]; 
	
	if (circular) {
		iteratorIndex= (iteratorIndex+1)% array.length;
		
	}
	else {
		iteratorIndex++; 
	}
	
	return valuetoDisplay;
}

@Override
public void reset() {
	// TODO Auto-generated method stub
	
	iteratorIndex = 0 ;

}

@Override
public boolean hasNext() {
	
	// TODO Auto-generated method stub
	
	if(circular) {
		return true;
	}
	else {
	return iteratorIndex <= (array.length -1);
	}//as long as the iterator index did not reach the last element, then there is a next item. 
}; 
	
	
}

