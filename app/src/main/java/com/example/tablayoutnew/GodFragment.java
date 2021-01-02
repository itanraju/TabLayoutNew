package com.example.tablayoutnew;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayoutnew.Adapter.FriendshipAdapter;
import com.example.tablayoutnew.Model.Category;
import com.example.tablayoutnew.Model.Root;
import com.example.tablayoutnew.Model.Theme;
import com.example.tablayoutnew.Service.Instance;
import com.example.tablayoutnew.Service.StatusServiceApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class GodFragment extends Fragment {

  RecyclerView recyclerView;

    public GodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_friendship, container, false);

        recyclerView=view.findViewById(R.id.recycleView);

        StatusServiceApi statusServiceApi= Instance.getStatusServiceApi();

        Call<Root> rootCall=statusServiceApi.getData("aciativtyksdfhal5215ajal",5,0);
        rootCall.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if(response.isSuccessful())
                {
                    Root root=response.body();
                    List<Category> categoryList=root.getCategory();
                    for(int i=0;i<categoryList.size();i++)
                    {
                        String categoryName=root.getCategory().get(i).getName();
                        if(categoryName.equals("God"))
                        {
                            List<Theme> themeSize=root.getCategory().get(i).getThemes();
                            for(int j=0;j<themeSize.size();j++)
                            {
                                List<Theme> urlList=root.getCategory().get(i).getThemes();
                                Log.d("theme",urlList.get(j).getSmall_thumbnail());

                                recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
                                FriendshipAdapter pixelBAbyAdapter=new FriendshipAdapter(getContext(),urlList);
                                recyclerView.setAdapter(pixelBAbyAdapter);
                            }
                        }
                        Log.d("Response",categoryName);
                    }
                }

            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {

                Log.d("Response",t.toString());

            }
        });

        return view;
    }
}