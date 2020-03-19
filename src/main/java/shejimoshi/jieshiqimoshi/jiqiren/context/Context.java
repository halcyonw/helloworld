package shejimoshi.jieshiqimoshi.jiqiren.context;

import java.util.StringTokenizer;

public class Context {
    private StringTokenizer st; //StringTokenizer类，用于将字符串分解为更小的字符串标记(Token)，默认情况下以空格作为分隔符
    private String currentToken; //当前字符串标记

    public Context(String text) {
        st = new StringTokenizer(text);
        System.out.println(st.countTokens());
        nextToken();
    }

    public String nextToken() {
        if (st.hasMoreTokens()) {
             currentToken = st.nextToken();
        }else {
            currentToken=null;
        }
        return currentToken;
    }

   public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token) {
       if (!token.equalsIgnoreCase(currentToken)) {
           System.out.println(currentToken);
            System.out.println("错误提示：" + currentToken + "解释错误");
        }
        nextToken();
    }

    public int currentNumber() {
        int number=0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            System.out.println("错误提示"+e);
        }
return number;
    }


}
