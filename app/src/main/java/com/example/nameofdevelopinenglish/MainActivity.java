package com.example.nameofdevelopinenglish;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;

/**
 * 主界面
 * @author Selene
 * @create 2020/3/18
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.et_input)
    EditText mEtInput;
    @BindView(R.id.btn_search)
    Button mBtnSearch;
    @BindView(R.id.rv_result_list)
    RecyclerView mRvResultList;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolbar() {
        mTvTitle.setText(R.string.title_main);
    }

    @Override
    protected void initView() {
        mBtnSearch.setText(R.string.btn_search);
    }

    @Override
    protected void initData() {

    }

}
