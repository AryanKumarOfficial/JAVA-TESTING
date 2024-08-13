package com.aryankumaroffical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionTesting {

	SortingArray array = new SortingArray();
	@Test
	void testsortingarray_exception() {
		/*
		 * try { int sortedarray[] = array.sortingarray(unsorted); for (int elem :
		 * sortedarray) { system.out.println(elem); }
		 * 
		 * system.out.println("statement below"); fail();
		 * 
		 * } catch (nullpointerexception e) { system.out.println("exception generated");
		 * 
		 * }
		 */

		int unsorted[] = null;
		assertThrows(NullPointerException.class, () -> array.sortingArray(unsorted));
	}

}
