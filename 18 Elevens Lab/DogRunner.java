//List of references - DogRunner

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class DogRunner
{
	public static void main(String args[])
	{
		Dog a = new Dog( "fred", 11);
		System.out.println( a );

		Dog b = new Dog( "ann", 21);
		System.out.println( b );

		Dog c = new Dog( "brian", 30);
		System.out.println( c );
	}
}
