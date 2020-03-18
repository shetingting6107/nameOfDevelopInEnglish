package com.example.nameofdevelopinenglish;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Activity的基类，若是有多个activity有类似的页面和数据处理
 * 则可以写一个基类，做统一处理。
 * @author Selene
 * @create 2020/3/18
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * 获取资源文件，即绑定对应的界面文件
     * @return 资源文件id
     */
    protected abstract int getLayoutId();

    /**
     * 初始化标题栏，由于每个页面都有标题栏，所以做统一处理，不同页面的标题栏可以做不同的设置
     */
    protected abstract void initToolbar();

    /**
     * 初始化视图，所有关于视图的方法都写在此方法里
     */
    protected abstract void initView();

    /**
     * 初始化数据，关于数据的初始化都放在此方法中
     */
    protected abstract void initData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);  //黄油刀（ButterKnife），效果等同于findViewById，不懂就自己百度
        initView();
        initToolbar();
        initData();
    }
}
