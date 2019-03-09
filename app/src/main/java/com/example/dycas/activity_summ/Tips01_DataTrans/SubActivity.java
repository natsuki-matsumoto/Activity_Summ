package com.example.dycas.activity_summ.Tips01_DataTrans;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dycas.activity_summ.R;

import java.io.Serializable;

import Temp.Interface_DataTypeList;

public class SubActivity extends AppCompatActivity implements Interface_DataTypeList {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra(KEY_BOOLEAN, false);
            byte byteExtra = getIntent().getByteExtra(KEY_BYTE, (byte) -1);
            char charExtra = getIntent().getCharExtra(KEY_CHAR, (char) -1);
            short shortExtra = getIntent().getShortExtra(KEY_SHORT, (short) -1);
            int intExtra = getIntent().getIntExtra(KEY_INT, -1);
            float floatExtra = getIntent().getFloatExtra(KEY_FLOAT, -1f);
            long longExtra = getIntent().getLongExtra(KEY_LONG, -1L);
            double doubleExtra = getIntent().getDoubleExtra(KEY_DOUBLE, -1d);
            String stringExtra = getIntent().getStringExtra(KEY_STRING);
            Serializable serializableExtra = getIntent().getSerializableExtra(KEY_SERIALIZABLE);
            Parcelable parcelableExtra = getIntent().getParcelableExtra(KEY_PARCELABLE);
        }
    }
}
