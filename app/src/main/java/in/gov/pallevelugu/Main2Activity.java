package in.gov.pallevelugu;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
   TextView textView,textView1;
    ProgressBar prg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.text1);
        textView1 = (TextView) findViewById(R.id.text2);
        final EditText editText1=(EditText) findViewById(R.id.from_name);
        final EditText editText2=(EditText) findViewById(R.id.editText3);
        prg=(ProgressBar)findViewById(R.id.progressBar);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredText1 = editText1.getText().toString();
                String enteredText2 = editText2.getText().toString();
                if (enteredText1.isEmpty() && enteredText2.isEmpty())
                    showAlert();
                else
                    prg.setProgress(25);
                prg.setProgress(100);
                Toast.makeText(Main2Activity.this,"fare is Rs.46",Toast.LENGTH_LONG).show();


            }
        });

    }

    private void showAlert()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Empty");
        builder.setMessage("Please enter details");
        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        });
        builder.show();


    }

}
