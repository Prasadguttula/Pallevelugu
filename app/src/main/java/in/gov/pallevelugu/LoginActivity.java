package in.gov.pallevelugu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText t1=(EditText)findViewById(R.id.editText);
        final EditText t2=(EditText)findViewById(R.id.editText2);
        Button b1=(Button)findViewById(R.id.login);
        Button b2=(Button)findViewById(R.id.help);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredText1 = t1.getText().toString();
                String enteredText2 = t2.getText().toString();
                String regex="user";
                String regex2="user123";
                if (enteredText1.isEmpty() && enteredText2.isEmpty())
                showAlert();
                else if(enteredText1.matches(regex) &&enteredText2.matches(regex2))
                {
                    Intent i1=new Intent(LoginActivity.this,Navigation.class);
                    startActivity(i1);
                }
                else
                    Toast.makeText(LoginActivity.this,"Login failed",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(LoginActivity.this,ScrollingActivity.class);
                startActivity(i2);
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
