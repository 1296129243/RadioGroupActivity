package zq.com.radiogroupactivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioFragment radioFragment = new RadioFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment,radioFragment);
        transaction.commit();

//        RadioGroup mRadio = findViewById(R.id.radiogroup);
//        mRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                Log.e(TAG,"选择：" + i);
//                Toast.makeText(MainActivity.this, "你点击的是按钮" + i, Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }
}
