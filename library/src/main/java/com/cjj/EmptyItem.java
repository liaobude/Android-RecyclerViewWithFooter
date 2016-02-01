package com.cjj;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zzz40500 on 16/1/31.
 */
public abstract class EmptyItem {


    public CharSequence emptyText;
    public int emptyIcon = -1;


    abstract View onCreateView(ViewGroup parent);

    abstract void onBindData(View view);

}