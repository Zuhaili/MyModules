package sg.edu.rp.c346.id19004781.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.textView);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("moduleName");
        int year = intentReceived.getIntExtra("year", 2020);
        int semester = intentReceived.getIntExtra("semester", 1);
        int moduleCredit = intentReceived.getIntExtra("moduleCredit", 4);
        String venue = intentReceived.getStringExtra("venue");
        tvAnswer.setText("Module Code: " + code + "\n Module Name: " + name + "\n Academic Year: " + year + "\n Semester: " + semester + "\n Module Credit: " + moduleCredit + "\n Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }
}
