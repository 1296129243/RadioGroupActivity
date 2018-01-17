package zq.com.radiogroupactivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2018/1/17.
 */

public class RadioFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.radiogroup, container, false);
        RadioGroup mRadio = view.findViewById(R.id.radiogroup);
        mRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Log.e(TAG,"选择：" + i);
                Toast.makeText(getActivity(), "你点击的是按钮" + i, Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
