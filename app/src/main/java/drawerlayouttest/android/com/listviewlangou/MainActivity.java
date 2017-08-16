package drawerlayouttest.android.com.listviewlangou;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView mainLv;
    //    private String[] data=new String[40];
    private List<Map<String, Object>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//
////      隐藏状态栏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
////      隐藏标题栏
//        ActionBar action = getSupportActionBar();
//        if (action != null) action.hide();

        setContentView(R.layout.activity_main);

        mainLv = (ListView) findViewById(R.id.main_lv);
//        for (int i = 0; i < 40; i++) {
//            data[i]="Langou-"+i;
//        }
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
//        mainLv.setAdapter(adapter);
        data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            HashMap<String, Object> info = new HashMap<>();
            info.put("img", R.mipmap.ic_launcher_round);
            info.put("txt", "这是数据 " + i);
            data.add(info);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, data, R.layout.item_main, new String[]{"img", "txt"}, new int[]{R.id.item_Iv, R.id.item_tv});
        mainLv.setAdapter(simpleAdapter);
    }
}
