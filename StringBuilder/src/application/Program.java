package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice Trip");
		Comment c2 = new Comment("Topzeira");
		Post p1 = new Post(
				sdf.parse("21/06/2020 12:12:12"),
				"Travel",
				"Bora viajar",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		

	}

}
