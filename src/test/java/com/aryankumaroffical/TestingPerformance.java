package com.aryankumaroffical;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test()
	void testSortingMethod_Performanc() {
		SortingArray array = new SortingArray();
		int unsorted[] = { 2, 5, 1 };
		assertTimeout(Duration.ofMillis(10
				), () -> array.sortingArray(unsorted));
	}

}
