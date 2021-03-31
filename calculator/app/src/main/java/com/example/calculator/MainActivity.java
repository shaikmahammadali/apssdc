package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    TextView exp,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exp=findViewById(R.id.textView);
        res=findViewById(R.id.result);

    }

    public static int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Integer> values = new
                Stack<Integer>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new
                Stack<Character>();

        for (int i = 0; i < tokens.length; i++)
        {

            // Current token is a
            // whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number,
            // push it to stack for numbers
            if (tokens[i] >= '0' &&
                    tokens[i] <= '9')
            {
                StringBuffer sbuf = new
                        StringBuffer();

                // There may be more than one
                // digits in number
                while (i < tokens.length &&
                        tokens[i] >= '0' &&
                        tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.
                        toString()));

                // right now the i points to
                // the character next to the digit,
                // since the for loop also increases
                // the i, we would skip one
                //  token position; we need to
                // decrease the value of i by 1 to
                // correct the offset.
                i--;
            }

            // Current token is an opening brace,
            // push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

                // Closing brace encountered,
                // solve entire brace
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(),
                            values.pop(),
                            values.pop()));
                ops.pop();
            }

            // Current token is an operator.
            else if (tokens[i] == '+' ||
                    tokens[i] == '-' ||
                    tokens[i] == '*' ||
                    tokens[i] == '/')
            {
                // While top of 'ops' has same
                // or greater precedence to current
                // token, which is an operator.
                // Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() &&
                        hasPrecedence(tokens[i],
                                ops.peek()))
                    values.push(applyOp(ops.pop(),
                            values.pop(),
                            values.pop()));

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been
        // parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(),
                    values.pop(),
                    values.pop()));

        // Top of 'values' contains
        // result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher
    // or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(
            char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') &&
                (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an
    // operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op,
                              int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException(
                            "Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public void equal(View view) {
        String expression=exp.getText().toString();
        int n =expression.length()-1;
        char lastdigit=expression.charAt(n);
        if (Character.isDigit(lastdigit))
        {
            String result = String.valueOf(evaluate(expression)) ;
            res.setText(result);
        }
        else
        {   res.setText("");
        }
    }

    public void point(View view) {
        exp.append(".");
    }

    public void zero(View view) {
        exp.append("0");
    }

    public void squareroot(View view) {
        exp.append("√");
    }

    public void addition(View view) {
        exp.append("+");
    }

    public void three(View view) {
        exp.append("3");
    }

    public void two(View view) {
        exp.append("2");
    }

    public void one(View view) {
        exp.append("1");
    }

    public void subtraction(View view) {
        exp.append("-");
    }

    public void six(View view) {
        exp.append("6");
    }

    public void four(View view) {
        exp.append("4");
    }

    public void multiplication(View view) {
        exp.append("*");
    }

    public void eight(View view) {
        exp.append("8");
    }

    public void seven(View view) {
        exp.append("7");
    }

    public void division(View view) {
        exp.append("/");
    }

    public void exponent(View view) {
        exp.append("^");
    }

    public void paranthesis(View view) {

    }

    public void clear(View view) {
        exp.setText("");
        if (exp.getText().toString().isEmpty())
            res.setText("");
    }

    public void backspace(View view) {
        String temp=exp.getText().toString();
        if (!temp.isEmpty())
        {int n =temp.length()-1;
        exp.setText(temp.substring(0,n));}
        if (exp.getText().toString().isEmpty())
            res.setText("");

        String expression=exp.getText().toString();
        int n =expression.length()-1;
        char lastdigit=expression.charAt(n);
        if (Character.isDigit(lastdigit))
        {
            String result = String.valueOf(evaluate(expression)) ;
            res.setText(result);
        }
        else
        {   res.setText("");
            }
    }

    public void five(View view) {
        exp.append("5");
    }

    public void nine(View view) {
        exp.append("9");
    }
}