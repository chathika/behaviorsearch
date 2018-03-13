package bsearch.external;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

//import java
public class PythonMetric {
	public double runMetric(Double ThreadID) {
		String s = "0";
		double returnVal = 0;
		Process p;
		try { 
			p = Runtime.getRuntime().exec("python D:\\RunMetric.py " + ThreadID.intValue());
		 BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            
				while ((s = stdInput.readLine()) != null) {
					returnVal = Double.parseDouble(s);
				    System.out.println(returnVal);
				    
				}
				stdInput.close();
			} catch (IOException e) {return Double.parseDouble(s);
			} 
		return Math.abs(returnVal - 0.71);
	}
}
