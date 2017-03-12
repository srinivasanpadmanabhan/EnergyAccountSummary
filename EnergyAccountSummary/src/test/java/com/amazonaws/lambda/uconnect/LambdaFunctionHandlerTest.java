package com.amazonaws.lambda.uconnect;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static String input;

    @BeforeClass
    public static void createInput() throws IOException {
        input = "Hello world";
    }

   /* private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");
        LambdaLogger lambdaLogger = new LambdaLogger() {
			
			public void log(String string) {
				System.out.println(string);
			}
		};
		ctx.setLogger(lambdaLogger);
        return ctx;
    }
*/
    @Test
    public void testLambdaFunctionHandler() {
        /*LambdaFunctionHandler handler = new LambdaFunctionHandler();
        Context ctx = createContext();

        String output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        if (output != null) {
            System.out.println(output.toString());
        }*/
    }
}
