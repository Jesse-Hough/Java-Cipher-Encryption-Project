import java.util.StringTokenizer;

public class Reverser extends Transpose
{
public Reverser(String s)
{
super(s);
}

public String reverseText(String text)
{
StringBuffer revtext = new StringBuffer();
StringTokenizer words = new StringTokenizer(text);
while (words.hasMoreTokens())
{
String s = words.nextToken();
revtext.insert(0, s + " ");
}
return revtext.toString().trim();
}


public String decode(String words)
{
return super.decode(words);
}
}
