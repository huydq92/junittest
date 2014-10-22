package com.quanghuy.main;

public class Main {

	public String calculator(double a, double b, double c)
	{
		String s = "";
		if(a != 0)
		{
			double delta = b*b - 4*a*c;
			if(delta > 0)
			{
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				s = "PT co 2 nghiem: " + x1 + " ; " + x2;
			}
			else if(delta == 0)
			{
				double xx = -b / (2*a);
				s = "PT co nghiem kep: " + xx;
			}
			else
				s = "PT bac 2 vo nghiem";
		}
		else if(b != 0)
		{
			double x = -c/b;
			s = "PT co 1 nghiem: " + x;
		}
		else if(c != 0)
			s = "PT vo nghiem";
		else
			s = "PT vo so nghiem";
		return s;
	}
}
