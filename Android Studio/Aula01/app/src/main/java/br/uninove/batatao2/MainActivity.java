package br.uninove.batatao2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText txtNum1;
    public EditText txtNum2;
    public TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtNum1 = findViewById(R.id.txtNum1);
        this.txtNum2 = findViewById(R.id.txtNum2);
        this.txtResult = findViewById(R.id.txtResult);


    }

        public void somar(View view) {

            double num1 = 0.0;
            double num2 = 0.0;
            double result = 0.0;
            num1 = Double.parseDouble(this.txtNum1.getText().toString());
            num2 = Double.parseDouble(this.txtNum2.getText().toString());
            result = num1 + num2;
            this.txtResult.setText(String.valueOf(result));

    }

}
