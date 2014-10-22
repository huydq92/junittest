package com.triangle.main;

public class Triangle {
	public String check(double a, double b, double c) {
		String status = "";
		if (((a + b) > c) && ((b + c) > a) && ((a + c) > b) && (a > 0)
				&& (b > 0) && (c > 0)) {
			if ((a == b) && (b == c))
				status = "Tam giac deu";
			else if ((a == b) || (b == c) || (c == a))
				status = "Tam giac can";
			else if (((a * a + b * b == c * c) && (a == b))
					|| ((a * a + c * c == b * b) && (a == c))
					|| ((b * b + c * c == a * a) && (b == c))) {
				status = "Tam giac vuong can";
			} else if ((a * a + b * b == c * c) || (b * b + c * c == a * a)
					|| (a * a + c * c == b * b))
				status = "Tam giac vuong";
			else
				status = "Tam giac thuong";

		} else
			status = "Khong la tam giac";

		return status;

	}
}
