


package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentManager;
        import androidx.fragment.app.FragmentTransaction;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void changeFragment(View view) {
        Fragment fragment;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (view == findViewById(R.id.button)) {
            fragment = new Fragment1();
            ft.replace(R.id.fragment_place, fragment);
        }
        if (view == findViewById(R.id.button2)) {
            fragment = new Fragment2();
            ft.replace(R.id.fragment_place, fragment);
        }
        ft.commit();
    }
}