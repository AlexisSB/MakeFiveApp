package com.example.alexis.makefive;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class GameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
                EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result+ "");
            }
        });
    }
}
