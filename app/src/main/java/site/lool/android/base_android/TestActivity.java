package site.lool.android.base_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    //region 成员变量

    TextView textView_out;

    //endrigion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textView_out = findViewById(R.id.textView_out_textActivity);
        textView_out.setText("硬编码内容");
        textView_out.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
