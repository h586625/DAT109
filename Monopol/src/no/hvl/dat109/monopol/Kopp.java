package no.hvl.dat109.monopol;

import java.util.ArrayList;
import java.util.List;

/**
 * Definerer en kopp med terninger.
 * 
 * @author Christoffer Riis
 *
 */
public class Kopp {
	List<Terning> terninger = new ArrayList<Terning>();
	private Integer sum;
	
	/**
	 * Trill en terning.
	 */
	public void trill() {
		sum = 0;
		
		for (Terning terning : terninger) {
			terning.trill();
			sum += terning.getVerdi();
		}
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
