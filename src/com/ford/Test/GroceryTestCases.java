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
	public void testCase1() {
		InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Apple\nsingle\n0.10\ny\nsoup\ntin\n0.65\ny\nbread\nloaf\n0.80\ny\nmilk\nbottle\n1.30\n\nn\n2023-02-17\n2\n3\ny\n3\n2\nn\n".getBytes()));

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
        Assert.assertEquals(output, "3.15");
	}
	
	@Test
	public void testCase2() {
		InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Apple\nsingle\n0.10\ny\nsoup\ntin\n0.65\ny\nbread\nloaf\n0.80\ny\nmilk\nbottle\n1.30\n\nn\n2023-02-17\n1\n6\ny\n4\n1\nn\n".getBytes()));

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
        Assert.assertEquals(output, "1.90");
	}
	
	@Test
	public void testCase3() {
		InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Apple\nsingle\n0.10\ny\nsoup\ntin\n0.65\ny\nbread\nloaf\n0.80\ny\nmilk\nbottle\n1.30\n\nn\n2023-02-22\n1\n6\ny\n4\n1\nn\n".getBytes()));

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
        Assert.assertEquals(output, "1.84");
	}
	
	@Test
	public void testCase4() {
		InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("Apple\nsingle\n0.10\ny\nsoup\ntin\n0.65\ny\nbread\nloaf\n0.80\ny\nmilk\nbottle\n1.30\n\nn\n2023-02-22\n1\n3\ny\n2\n2\ny\n3\n1\nn\n".getBytes()));

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
        Assert.assertEquals(output, "1.97");
	}
	
}
