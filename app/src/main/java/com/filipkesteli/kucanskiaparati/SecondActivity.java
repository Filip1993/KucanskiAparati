package com.filipkesteli.kucanskiaparati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText etKucanskiAparatSecond;
    private EditText etStrujaSecond;
    private EditText etVodaSecond;
    private EditText etPlinSecond;
    private Button btnBACK;
    private Button btnOUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();
        handleIntents();
        setupListeners();
    }

    private void initWidgets() {
        etKucanskiAparatSecond = (EditText) findViewById(R.id.etKucanskiAparatSecond);
        etStrujaSecond = (EditText) findViewById(R.id.etStrujaSecond);
        etVodaSecond = (EditText) findViewById(R.id.etVoda);
        etPlinSecond = (EditText) findViewById(R.id.etPlin);
        btnBACK = (Button) findViewById(R.id.btnBACK);
        btnOUT = (Button) findViewById(R.id.btnOUT);
    }

    private void handleIntents() {
        Intent intent = getIntent();

        if (intent.hasExtra(MainActivity.PARAMETER_KUCANSKI_APARATI)) {
            etKucanskiAparatSecond.setText(intent.getStringExtra(MainActivity.PARAMETER_KUCANSKI_APARATI));
        }
        if (intent.hasExtra(MainActivity.PARAMETER_STRUJA)) {
            etStrujaSecond.setText(intent.getStringExtra(MainActivity.PARAMETER_STRUJA));
        }
        if (intent.hasExtra(MainActivity.PARAMETER_VODA)) {
            etVodaSecond.setText(intent.getStringExtra(MainActivity.PARAMETER_VODA));
        }
        if (intent.hasExtra(MainActivity.PARAMETER_PLIN)) {
            etPlinSecond.setText(intent.getStringExtra(MainActivity.PARAMETER_PLIN));
        }
    }

    private void setupListeners() {
        btnBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });
        btnOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
