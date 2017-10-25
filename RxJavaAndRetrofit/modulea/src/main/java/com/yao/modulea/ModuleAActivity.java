package com.yao.modulea;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yao.lib_mvp.BaseActivity;
import com.yao.resource.constants.RouterConstants;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = RouterConstants.MODULE_A_ACTIVITY)
public class ModuleAActivity extends BaseActivity {

    @BindView(R2.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_a);
        Intent intent = getIntent();
        String name = intent.getStringExtra("module");
        if (!TextUtils.isEmpty(name))
            tv.setText(name);
    }

    @OnClick({R2.id.tv})
    public void clickEvent(View view) {
        int id = view.getId();
        if (id == R.id.tv) {
            /*Intent intent = new Intent();
            intent.setAction("com.yao.module.b.main.activity");
            startActivity(intent);*/
        }
    }
}
