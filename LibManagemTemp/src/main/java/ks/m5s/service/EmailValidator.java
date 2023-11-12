package ks.m5s.service;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class EmailValidator {
	
	 private static final String EMAIL_PATTERN =
	            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
	            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

	    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	    public static boolean isValid(final String email) {
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }


}
