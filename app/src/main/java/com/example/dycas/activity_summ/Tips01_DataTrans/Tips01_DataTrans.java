package com.example.dycas.activity_summ.Tips01_DataTrans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dycas.activity_summ.Base01_Activity.Base01_Activity;
import com.example.dycas.activity_summ.R;

import Temp.Interface_DataTypeList;

/**
 * startActivity時のデータ送信.
 */
public class Tips01_DataTrans extends Base01_Activity implements Interface_DataTypeList {
    /** title */
    static final String ACTIVITY_TITLE = "startActivity時のデータ送信.";

    /** 概要 */
    static final String ACTIVITY_OUTLINE = "putExtraで各データ型が送信できることを確認.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips01_data_trans);

        findViewById(R.id.button01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);

                // プリミティブ型
                intent.putExtra(KEY_BOOLEAN, mBoolean);
                intent.putExtra(KEY_BYTE, mByte);
                intent.putExtra(KEY_CHAR, mChar);
                intent.putExtra(KEY_SHORT, mShort);
                intent.putExtra(KEY_INT, mInt);
                intent.putExtra(KEY_FLOAT, mFloat);
                intent.putExtra(KEY_LONG, mLong);
                intent.putExtra(KEY_DOUBLE, mDouble);
                // 参照型
                intent.putExtra(KEY_STRING, mString);
                // Serializable
                intent.putExtra(KEY_SERIALIZABLE, mSerializableClass);
                // Parcelable
                intent.putExtra(KEY_PARCELABLE, mParcelableClass);

                startActivity(intent);
            }
        });
    }

    @Override
    public String getActivityTitle() {
        return ACTIVITY_TITLE;
    }

    @Override
    public String getActivityOutLine() {
        return ACTIVITY_OUTLINE;
    }
}
