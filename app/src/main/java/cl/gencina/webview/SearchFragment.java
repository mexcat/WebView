package cl.gencina.webview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.gencina.webview.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {
    private FragmentSearchBinding binding;

    public SearchFragment() {
        // Required empty public constructor
    }

    public static SearchFragment newInstance() {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(getLayoutInflater(), container, false);
        binding.btnWeb.setOnClickListener(v -> callFragment(binding.etWebDirection.getText().toString()));
        return binding.getRoot();
    }

    private void callFragment(String url) {
        WebViewFragment navegador = WebViewFragment.newInstance(url);
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fcv, navegador, "NAVEGADOR");
        transaction.commit();
    }
}