package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		StringBuilder spacing = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
		   if (i > 0) {
		      spacing.append(" ");
		    }

		   spacing.append(log.charAt(i));
		}

		System.out.println(spacing.toString());
		
		
		
		
	}

	@Override
	public void error(String error) {
		
		
		StringBuilder spacing = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
		   if (i > 0) {
		      spacing.append(" ");
		    }

		   spacing.append(error.charAt(i));
		}

		System.out.println(spacing.toString());
		
		
	}

	
	
		

}
