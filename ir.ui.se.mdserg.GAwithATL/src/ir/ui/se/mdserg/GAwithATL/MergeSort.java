package ir.ui.se.mdserg.GAwithATL;

import java.util.ArrayList;

import org.eclipse.m2m.atl.emftvm.Model;

class MergeSort 
{ 
	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	void merge(double[] popCRA, ArrayList<Model> pop, int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		/* Create temp arrays */
		double L[] = new double [n1]; 
		ArrayList<Model> Lpop = new ArrayList<Model>();
		
		double R[] = new double [n2]; 
		ArrayList<Model> Rpop = new ArrayList<Model>();
		
		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i){ 
			L[i] = popCRA[l + i]; 
			Lpop.add(pop.get(l + i));
		}
		
		for (int j=0; j<n2; ++j) {
			R[j] = popCRA[m + 1+ j]; 
			Rpop.add(pop.get(m + 1+ j));
		}


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i] > R[j]) 
			{ 
				popCRA[k] = L[i]; 
				pop.set(k, Lpop.get(i));
				i++; 
			} 
			else
			{ 
				popCRA[k] = R[j];
				pop.set(k, Rpop.get(j));
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of L[] if any */
		while (i < n1) 
		{ 
			popCRA[k] = L[i]; 
			pop.set(k, Lpop.get(i));
			i++; 
			k++; 
		} 

		/* Copy remaining elements of R[] if any */
		while (j < n2) 
		{ 
			popCRA[k] = R[j]; 
			pop.set(k, Rpop.get(j));
			j++; 
			k++; 
		} 
	} 

	// Main function that sorts arr[l..r] using 
	// merge() 
	void sort(double[] popCRA, ArrayList<Model> pop, int l, int r) 
	{ 
		if (l < r) 
		{ 
			// Find the middle point 
			int m = (l+r)/2; 

			// Sort first and second halves 
			sort(popCRA, pop, l, m); 
			sort(popCRA, pop, m+1, r); 

			// Merge the sorted halves 
			merge(popCRA, pop, l, m, r); 
		} 
	} 
} 


