package wtm.gdgeskisehir.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wtm.gdgeskisehir.com.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();
        user.setName("mert");
        user.setSurname("simsek");

        updateUser(user);
    }

    private void updateUser(User user) {
        binding.setUser(user);
    }
}
