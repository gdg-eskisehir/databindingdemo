package wtm.gdgeskisehir.com.databindingdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mertsimsek on 04/03/16.
 */
public class MainFragment extends Fragment {

    RecyclerView recyclerView;
    DataBindingAdapter dataBindingAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<User> userList = new ArrayList<>();
        User user;

        for (int i = 0; i < 50; i++) {
            user = new User();
            user.setName("User " + i);
            userList.add(user);
        }

        dataBindingAdapter = new DataBindingAdapter(userList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(dataBindingAdapter);


    }
}
