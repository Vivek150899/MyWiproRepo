package pack2;

import java.util.HashSet;
import java.util.Set;

import pack1.Circle;
import pack1.Loan;

public class Main2 {

	public static void main(String[] args) {
		
		Set<Circle>circleSet=new HashSet<>();
		circleSet.add(new Circle(75));
		circleSet.add(new Circle(35));
		circleSet.add(new Circle(15));
		circleSet.add(new Circle(20));
		circleSet.add(new Circle(40));
		
		circleSet.forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		circleSet.stream().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		circleSet.stream().sorted().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		circleSet.stream().filter(c->c.getRadius()>25).forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		circleSet.stream().filter(c->c.getRadius()>25).sorted().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		
		Set<Loan>loanSet=new HashSet<>();
		loanSet.add(new Loan(12,"Arpit",10000.0,18));
		loanSet.add(new Loan(13,"Rajesh",12000.0,13));
		loanSet.add(new Loan(14,"Kunal",11000.0,12));
		loanSet.add(new Loan(15,"Vivek",16000.0,14));
		loanSet.add(new Loan(16,"Ajit",13000.0,10));
		
		loanSet.forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		loanSet.stream().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		loanSet.stream().sorted().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		loanSet.stream().filter(c->c.getTenure()>13).forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		loanSet.stream().filter(c->c.getTenure()>10).sorted().forEach((c)->System.out.println(c));
		
		
		
		

	}

}
