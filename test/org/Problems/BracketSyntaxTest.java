package org.Problems;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rajeevgurram on 5/28/16.
 */
public class BracketSyntaxTest {
    @Test
    public void testCheckSyntax(){
        String code= "function myFunction(p1, p2) {\n" +
                "    return p1 * p2;              // The function returns the product of p1 and p2\n" +
                "}";

        BracketSyntax syntaxChecker= new BracketSyntax();
        Assert.assertEquals(syntaxChecker.checkSyntax(code), true);

        code="function test(){\n" +
                "\t\tvar obj= {\n" +
                "\t\t\t\"(\": \")\",\n" +
                "\t\t\t\"{\": \"}\",\n" +
                "\t\t\t\"[\": \"]\"\n" +
                "\t\t};\n" +
                "\n" +
                "\t\tvar code= document.getElementById(\"text\").value;\n" +
                "\n" +
                "\t\tvar chars= code.split('');\n" +
                "\n" +
                "\t\tif(chars.length % 2 != 0){\n" +
                "\t\t\talert(\"false\");\n" +
                "\t\t\treturn false;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tvar newChars= [];\n" +
                "\n" +
                "\t\tfor(var i=0; i<chars.length; i++){\n" +
                "\t\t\tif(obj[chars[i]]){\n" +
                "\t\t\t\tnewChars.push(chars[i]);\n" +
                "\t\t\t}\n" +
                "\t\t\telse{\n" +
                "\t\t\t\tvar char= newChars[newChars.length -1];\n" +
                "\t\t\t\tvar closedChar= chars[i];\n" +
                "\n" +
                "\t\t\t\tif(obj[char] == closedChar){\n" +
                "\t\t\t\t\tnewChars.splice(newChars.length -1, 1);\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\telse{\n" +
                "\t\t\t\t\talert(\"False\");\n" +
                "\t\t\t\t\treturn false;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\talert(\"True\");\n" +
                "\t\treturn true;\n" +
                "\t};";

            Assert.assertEquals(syntaxChecker.checkSyntax(code), true);
    }
}
