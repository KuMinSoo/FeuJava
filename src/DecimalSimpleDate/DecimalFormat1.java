package DecimalSimpleDate;

import java.text.DecimalFormat;

public class DecimalFormat1 {

	public static void main(String[] args) {
		double number = 1234567.89;
		String[] pattern = {
			"0",
			"#",
			"0.0",
			"#.#",
			"0000000000.0000",
			"############.####",
			"#.#-",
			"-#.#",
			"#,###,###.##",
			"#,####.##",
			"#E0",
			"0E0",
			"##E0",
			"00E0",
			"####E0",
			"0000E0",
			"#.#E0",
			"0.00000000E0",
			"000.0000000E0",
			"#.#########E0",
			"##.########E0",
			"###.#######E0",
			"#,###.##+;#,###,##-",
			"#.#%",
			"\u00A4 #,###",
			"'#'#,###",
			"''#,###"
			
		};
		for(int i=0;i<pattern.length;i++) {
			DecimalFormat dec=new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n",pattern[i],dec.format(number));				
		};

	}

}
