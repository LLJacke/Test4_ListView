package com.lljackie.Test4_ListView;

import android.os.Bundle;


        import android.app.Activity;
        import android.widget.ListView;
        import android.widget.SimpleAdapter;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class MainActivity extends Activity {
    private final static String NAME="name";
    private final static String CLASS="class";
    private final static String NUMBER="number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] st_name = {"Jack","Rose","Mike","Victor"};
        String[] st_sex = {"male", "female","male", "male"};
        String[] st_number = {"2014001", "2014002","2014003","2014004"};

        List<Map<String,Object>> items=new ArrayList<>();

        for(int i=0;i<st_name.length;i++) {
            Map<String,Object> item= new HashMap<>();
            item.put(NAME, st_name[i]);
            item.put(CLASS, st_sex[i]);
            item.put(NUMBER, st_number[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,
                new String[]{NAME,CLASS,NUMBER},
                new int[]{R.id.product_1,R.id.product_2,R.id.product_3});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);

    }
}
