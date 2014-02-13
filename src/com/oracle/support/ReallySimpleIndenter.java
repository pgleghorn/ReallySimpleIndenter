package com.oracle.support;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Usage: java -jar ReallySimpleIndenter.jar <i>filename</i>
 * 
 * A really simple text indenter, has lots of bugs and many restrictions.
 * written because it was quicker to do this than it was to read the
 * indent(1) man page.
 * 
 * <ul>
 * <li> takes one optional argument, the file to read
 * <li> if not specified, reads from stdin
 * <li> writes to stdout
 * <li> expects only one { or } per line
 * <li> does not check if braces are unbalanced
 * <li> uses the normal line breaks from the input, not when a brace is actually encountered on a line
 * <li> indent width not configurable
 * <li> character to indent on is not configurable, only curly braces
 * <li> no way to select brace style
 * </ul>
 */
public class ReallySimpleIndenter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = null;
			if (args.length > 0) {
				br = new BufferedReader(new FileReader(args[0]));
			} else {
				InputStreamReader isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
			}
			String line;
			int indent = 0;
			while ((line = br.readLine()) != null) {
				// determine the current indent
				if (line.contains("}"))
					indent--;
				
				// print the current indent
				for (int i = 0; i < indent; i++) {
					System.out.print("    ");
				}
				// print the current line
				System.out.println(line);

				// determine the next indent
				if (line.contains("{"))
					indent++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
