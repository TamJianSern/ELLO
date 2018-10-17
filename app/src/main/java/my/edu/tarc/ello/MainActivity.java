package my.edu.tarc.ello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView = class, textViewMessage = instance
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main function
        super.onCreate(savedInstanceState);
        //show UI, R =resource, layout = folder
        setContentView(R.layout.activity_main);
        textViewMessage = findViewById(R.id.textViewMessage);
    }

        public void showMessage(View view){

            textViewMessage.setText("HELLO Skyz");

        }
}
