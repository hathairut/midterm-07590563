package th.ac.su.cp.speedcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button en_cal = (Button) findViewById(R.id.button_cal);
        final Button en_clear = (Button)findViewById(R.id.button_clear);

        en_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView text1 =(EditText)findViewById(R.id.editTextNumberDecimal);
                TextView text2 =(EditText)findViewById(R.id.editTextNumberDecimal2);
                TextView text3 =(EditText)findViewById(R.id.textView3);










            }
        });
    }
}