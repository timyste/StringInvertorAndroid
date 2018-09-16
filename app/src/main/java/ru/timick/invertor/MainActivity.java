package ru.timick.invertor;

import android.support.v7.app.*;
import android.os.*;
import android.text.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    public char[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView result = (TextView)this.findViewById(R.id.result);
        EditText from = (EditText)this.findViewById(R.id.from);

        Editable e = from.getText();
        String s = e.toString();
        arr = s.toCharArray();
        reverse(arr);
        String res = "";
        for(int i = 0; i < arr.length;i++) {
            try {
                res += String.valueOf(arr[i]);
            } catch(Exception ex){}
        }
        result.setText(res);
    }
    private void reverse(char[] input) {
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            char temp = input[i];
            //меняем номера
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
    }
}
