package cl.gencina.webview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import cl.gencina.webview.databinding.FragmentWebViewBinding;

public class WebViewFragment extends Fragment {

    private static final String ARG_URL = "url";
    private String url;
    private FragmentWebViewBinding binding;
    public WebViewFragment() {
        // Required empty public constructor
    }
    public static WebViewFragment newInstance(String url) {
        WebViewFragment fragment = new WebViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_URL, url);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            url = getArguments().getString(ARG_URL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWebViewBinding.inflate(getLayoutInflater(),container,false);
        binding.wvMuestra.loadUrl(url);
        binding.btnVolver.setOnClickListener(v -> {});
        return binding.getRoot();
    }


}