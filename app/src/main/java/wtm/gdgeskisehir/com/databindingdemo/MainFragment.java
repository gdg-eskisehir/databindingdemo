package wtm.gdgeskisehir.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wtm.gdgeskisehir.com.databindingdemo.databinding.FragmentMainBinding;

/**
 * Created by mertsimsek on 04/03/16.
 */
public class MainFragment extends Fragment {

    FragmentMainBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        User user = new User();
        user.setName("mert");
        user.setSurname("simsek");

        binding.setUser(user);

        return binding.getRoot();
    }
}
