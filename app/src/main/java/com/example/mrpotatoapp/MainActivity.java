package com.example.mrpotatoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mrPotato(View view){
        boolean isChecked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.hatCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.Hat), isChecked);
                break;
            case R.id.noseCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.nose), isChecked);
                break;
            case R.id.eyesCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.eyes), isChecked);
                break;
            case R.id.eyebrowsCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.eyebrows), isChecked);
                break;
            case R.id.glassesCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.glasses), isChecked);
                break;
            case R.id.earsCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.ears), isChecked);
                break;
            case R.id.mouthCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.mouth), isChecked);
                break;
            case R.id.mustacheCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.mustache), isChecked);
                break;
            case R.id.shoesCheckBox:
                setImageVisibility((ImageView) findViewById(R.id.shoes), isChecked);
                break;
            case R.id.armsCheckbox:
                setImageVisibility((ImageView) findViewById(R.id.arms), isChecked);
                break;
        }
    }

    private void setImageVisibility(ImageView image, boolean isChecked){
        if(isChecked)
            image.setVisibility(View.VISIBLE);
        else
            image.setVisibility(View.INVISIBLE);
    }
}
