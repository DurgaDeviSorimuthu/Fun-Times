package com.ford.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.ford.Groceryshopping;

public class GroceryTestCases {

	@Test
	public void addProduct() {
		InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Apple\nsingle\n0.25\nn\n1\n5\nn\n".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        Groceryshopping.main(new String[0]);

        System.setIn(stdin);
        System.setOut(stdout);

        String outputText = byteArrayOutputStream.toString();
        String key = "OverAllAmount:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        Assert.assertEquals(output, "1.125\r\n"
        		+ "				----------------Thank You for Shopping!!-----------------\r\n"
        		+ "				                     Visit Again");
		
		
	}
	
}
