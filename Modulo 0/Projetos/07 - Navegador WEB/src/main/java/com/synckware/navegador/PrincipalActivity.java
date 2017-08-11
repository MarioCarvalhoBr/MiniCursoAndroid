package com.synckware.navegador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
    EditText txtUrl;
    Button btnCarregar;
    WebView navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtUrl = (EditText) findViewById(R.id.txtUrl);
        btnCarregar = (Button) findViewById(R.id.btnCarregar);

        navegador = (WebView) findViewById(R.id.webview);
        navegador.setWebViewClient(new WebViewClient());
        navegador.getSettings().setJavaScriptEnabled(true);

        btnCarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String endereco = txtUrl.getText().toString();
                navegador.loadUrl("https://www.google.com.br/search?q="+endereco);
            }
        });
    }
}
