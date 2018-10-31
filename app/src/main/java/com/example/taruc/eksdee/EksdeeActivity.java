package com.example.taruc.eksdee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EksdeeActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eksdee);
        mShowCount = (TextView) findViewById(R.id.show_Count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
        mCount ++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countUp(View view) {
        mCount ++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }
}
