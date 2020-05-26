package sg.edu.rp.c346.id19004781.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid, tviPad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textViewC346);
        tviPad = findViewById(R.id.textViewC349);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("semester", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        tviPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("moduleName", "iPad Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("semester", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }

        });


    }
}
