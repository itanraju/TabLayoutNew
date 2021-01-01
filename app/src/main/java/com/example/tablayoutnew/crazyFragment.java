package com.example.tablayoutnew;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tablayoutnew.Model.Category;
import com.example.tablayoutnew.Model.Root;
import com.example.tablayoutnew.Model.Theme;
import com.example.tablayoutnew.Service.Instance;
import com.example.tablayoutnew.Service.StatusServiceApi;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class crazyFragment extends Fragment {

    StatusServiceApi statusServiceApi;

    List<Category> categoryList=new ArrayList<>();

    public crazyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        statusServiceApi=Instance.getStatusServiceApi();

        Call<Root> rootCall=statusServiceApi.getData("aciativtyksdfhal5215ajal",5,0);
        rootCall.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if(response.isSuccessful())
                {
                    Log.d("Response","success");
                    Root root=response.body();
                    Log.d("TAGOP","response "+new Gson().toJson(root));

                    categoryList=root.getCategory();

                    for(int i=0;i<categoryList.size();i++)
                    {
                        String categoryName=root.getCategory().get(i).getName();
                        Log.d("Category",categoryName);

                    }
                }
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
               Log.d("Response","Fail");
            }
        });


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crazy, container, false);

    }
}