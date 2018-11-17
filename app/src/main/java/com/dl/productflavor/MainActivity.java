package com.dl.productflavor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_view_main_app_name)
    public TextView mTextViewAppName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initialize();
    }

    private void initialize() {
        setupAppName();
    }

    private void setupAppName() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildConfig.PRODUCT)
                .append("\n")
                .append(this.getPackageName());

        mTextViewAppName.setText(sb.toString());
    }
}
