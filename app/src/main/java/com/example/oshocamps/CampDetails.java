package com.example.oshocamps;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CampDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camps_list);
        Intent intent = getIntent();
        int idValue = intent.getIntExtra("id", 0);
        TextView campTextView = findViewById(R.id.campView);

        switch (idValue) {
            case R.id.ashram1:
                Spanned sp1 = Html.fromHtml(getString(R.string.international));
                campTextView.setText(sp1);
                break;
            case R.id.ashram2:
                Spanned sp2 = Html.fromHtml(getString(R.string.madhuban));
                campTextView.setText(sp2);
                break;
            case R.id.ashram3:
                Spanned sp3 = Html.fromHtml(getString(R.string.gangadham));
                campTextView.setText(sp3);
                break;
            case R.id.ashram4:
                Spanned sp4 = Html.fromHtml(getString(R.string.nisarga));
                campTextView.setText(sp4);
                break;
            case R.id.ashram5:
                Spanned sp5 = Html.fromHtml(getString(R.string.oshodham));
                campTextView.setText(sp5);
                break;
            case R.id.ashram6:
                Spanned sp6 = Html.fromHtml(getString(R.string.amritdham));
                campTextView.setText(sp6);
                break;
            case R.id.ashram7:
                Spanned sp7 = Html.fromHtml(getString(R.string.sanzen));
                campTextView.setText(sp7);
        }

    }
}
