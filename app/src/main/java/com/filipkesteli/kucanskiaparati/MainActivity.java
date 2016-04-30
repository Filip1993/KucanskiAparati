package com.filipkesteli.kucanskiaparati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final String PARAMETER_KUCANSKI_APARATI = "PARAMETER_KUCANSKI_APARATI";
    public static final String PARAMETER_STRUJA = "PARAMETER_STRUJA";
    public static final String PARAMETER_VODA = "PARAMETER_VODA";
    public static final String PARAMETER_PLIN = "PARAMETER_PLIN";
    public static final int REQUEST_CODE = 0;
    private Spinner spKucanskiAparati;
    private RadioGroup rgStruja;
    private RadioGroup rgVoda;
    private RadioGroup rgPlin;
    private RadioButton rbStrujaIma;
    private RadioButton rbStrujaNema;
    private RadioButton rbVodaIma;
    private RadioButton rbVodaNema;
    private RadioButton rbPlinIma;
    private RadioButton rbPlinNema;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        spKucanskiAparati = (Spinner) findViewById(R.id.spKucanskiAparati);
        rgStruja = (RadioGroup) findViewById(R.id.rgStruja);
        rgVoda = (RadioGroup) findViewById(R.id.rgVoda);
        rgPlin = (RadioGroup) findViewById(R.id.rgPlin);
        rbStrujaIma = (RadioButton) findViewById(R.id.rbStrujaIma);
        rbStrujaNema = (RadioButton) findViewById(R.id.rbStrujaNema);
        rbVodaIma = (RadioButton) findViewById(R.id.rbVodaIma);
        rbVodaNema = (RadioButton) findViewById(R.id.rbVodaNema);
        rbPlinIma = (RadioButton) findViewById(R.id.rbPlinIma);
        rbPlinNema = (RadioButton) findViewById(R.id.rbPlinNema);
        btnOK = (Button) findViewById(R.id.btnOK);
    }

    private void setupListeners() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentOK();
                intentForResultOK();
            }
        });
    }

    private void intentForResultOK() {
        Intent intent = new Intent(this, SecondActivity.class);

        //pomocne varijable: kucanskiAparat, struja, voda, plin:
        String kucanskiAparat = spKucanskiAparati.getSelectedItem().toString();
        String struja = null;
        String voda = null;
        String plin = null;

        switch (rgStruja.getCheckedRadioButtonId()) {
            case R.id.rbStrujaIma:
                struja = rbStrujaIma.getText().toString();
                break;
            case R.id.rbStrujaNema:
                struja = rbStrujaNema.getText().toString();
                break;
        }

        switch (rgVoda.getCheckedRadioButtonId()) {
            case R.id.rbVodaIma:
                voda = rbVodaIma.getText().toString();
                break;
            case R.id.rbVodaNema:
                voda = rbVodaNema.getText().toString();
                break;
        }

        switch (rgPlin.getCheckedRadioButtonId()) {
            case R.id.rbPlinIma:
                plin = rbPlinIma.getText().toString();
                break;
            case R.id.rbPlinNema:
                plin = rbPlinNema.getText().toString();
                break;
        }

        intent.putExtra(PARAMETER_KUCANSKI_APARATI, kucanskiAparat);
        intent.putExtra(PARAMETER_STRUJA, struja);
        intent.putExtra(PARAMETER_VODA, voda);
        intent.putExtra(PARAMETER_PLIN, plin);

        startActivityForResult(intent, REQUEST_CODE);
    }

    private void intentOK() {
        Intent intent = new Intent(this, SecondActivity.class);

        //pomocne varijable: kucanskiAparat, struja, voda, plin:
        String kucanskiAparat = spKucanskiAparati.getSelectedItem().toString();
        String struja = null;
        String voda = null;
        String plin = null;

        switch (rgStruja.getCheckedRadioButtonId()) {
            case R.id.rbStrujaIma:
                struja = rbStrujaIma.getText().toString();
                break;
            case R.id.rbStrujaNema:
                struja = rbStrujaNema.getText().toString();
                break;
        }

        switch (rgVoda.getCheckedRadioButtonId()) {
            case R.id.rbVodaIma:
                voda = rbVodaIma.getText().toString();
                break;
            case R.id.rbVodaNema:
                voda = rbVodaNema.getText().toString();
                break;
        }

        switch (rgPlin.getCheckedRadioButtonId()) {
            case R.id.rbPlinIma:
                plin = rbPlinIma.getText().toString();
                break;
            case R.id.rbPlinNema:
                plin = rbPlinNema.getText().toString();
                break;
        }

        intent.putExtra(PARAMETER_KUCANSKI_APARATI, kucanskiAparat);
        intent.putExtra(PARAMETER_STRUJA, struja);
        intent.putExtra(PARAMETER_VODA, voda);
        intent.putExtra(PARAMETER_PLIN, plin);

        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
