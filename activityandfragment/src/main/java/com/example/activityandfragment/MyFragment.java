package com.example.activityandfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/29/029.
 */

public class MyFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.fragment,container,false);

        TextView tv= (TextView) v.findViewById(R.id.tv);
        String name= (String) getArguments().get("name");
        tv.setText(name);
        Toast.makeText(getActivity(), "接受信息为+"+name, Toast.LENGTH_SHORT).show();
        return v;
    }
}
