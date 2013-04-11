package com.thao.jaxrs.fibonacci;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fibonacci")
public class FibonacciServerREST {
	
	@GET
   @Path("{n}")
   @Produces(MediaType.TEXT_PLAIN)
   public String getFibSequenceAsText(@PathParam("n") int n) {
		// call my recursive fibonacci sequence
		StringBuffer thaoStringBuffer = new StringBuffer();
		
		if (n<0){
			return ("Thao says go away because you entered a negative number");
		}
		
		for ( int i = 0; i<=n; i++ ){
			thaoStringBuffer.append(fib(i) + " ");
		}
		
		// now return our text representation of the sequence
      return (thaoStringBuffer.toString());
   }

	private static int fib( int n ){
		if (n==0){
			return 0;
		} else if (n<=2) {
			return 1;
		} else {
			return fib(n-2) + fib(n-1);
		}
	}
}
