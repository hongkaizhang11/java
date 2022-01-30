package com.huaxia.hongkai.ifelse;

import java.util.Scanner;

/**
 * * Get user input of year, write java if-else code to determine if the year is leap year or not.

[Rule for leap year](https://docs.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-year)

1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days).
5. The year is not a leap year (it has 365 days).

Expected output:

```output1
Enter a year: 1992
1992 is a leap year.
```

```output2
Enter a year: 1900
1900 is NOT a leap year.
```

 * @author Hongkai Z
 *
 */

public class IfelseHW01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		input.close();
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}
		String str1 = "";
		if (leap == false) {
			str1 = " NOT";
		}
		String str2 = "%d is%s a leap year.";
		System.out.printf(str2,year,str1);

	}

}
