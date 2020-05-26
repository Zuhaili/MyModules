package sg.edu.rp.c346.id19004781.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

//        tvCode = findViewById(R.id.textViewModuleCode);
//        tvmoduleName = findViewById(R.id.textViewModulename);
//        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
//        tvSemester = findViewById(R.id.textViewSemester);
//        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
//        tvVenue = findViewById(R.id.textViewVenue);
        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("moduleName");
        int year = intentReceived.getIntExtra("year", 2020);
        int semester = intentReceived.getIntExtra("semester", 1);
        int moduleCredit = intentReceived.getIntExtra("moduleCredit", 4);
        String venue = intentReceived.getStringExtra("venue");
        tvAnswer.setText("Module Code: " + code + "\n Module Name: " + name + "\n Academic Year: " + year + "\n Semester: " + semester + "\n Module Credit: " + moduleCredit + "\n Venue: " + venue);




    }
}
