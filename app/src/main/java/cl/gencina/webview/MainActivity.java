package cl.gencina.webview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import cl.gencina.webview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        callFragment("");
    }

    private void callFragment(String url) {
        SearchFragment navegador = SearchFragment.newInstance("","");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().replace(R.id.fcv, navegador, "NAVEGADOR");
        transaction.commit();
    }
}