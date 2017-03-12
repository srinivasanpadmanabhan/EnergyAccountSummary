package com.amazonaws.lambda.uconnect;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class LambdaFunctionHandler extends SpeechletRequestStreamHandler {
	 private static final Set<String> supportedApplicationIds = new HashSet<String>();
	    static {
	        /*
	         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
	         * Alexa Skill and put the relevant Application Ids in this Set.
	         */
	        supportedApplicationIds.add("amzn1.ask.skill.aadbee56-ef1a-458c-8911-f5743316dc22");
	    }

	    public LambdaFunctionHandler() {
	        super(new SampleSpeechlet(), supportedApplicationIds);
	    }
	
	
}
