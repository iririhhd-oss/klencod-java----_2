package com.iris.files;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        webView.setWebViewClient(new WebViewClient());

        String htmlContent = "<!DOCTYPE html>\n" +
                "<html lang=\"ar\" dir=\"rtl\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n" +
                "    <title>Z-Archiver Pro - مدير ومضغط الملفات</title>\n" +
                "    <link href=\"https://fonts.googleapis.com/css2?family=Tajawal:wght@400;500;700;800&display=swap\" rel=\"stylesheet\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\n" +
                "    <style>\n" +
                "        :root {\n" +
                "            --bg-primary: #0a0f1d;\n" +
                "            --bg-secondary: #131b2e;\n" +
                "        }\n" +
                "        body {\n" +
                "            background-color: var(--bg-primary);\n" +
                "            color: #ffffff;\n" +
                "            font-family: 'Tajawal', sans-serif;\n" +
                "            margin: 0;\n" +
                "            padding: 20px;\n" +
                "        }\n" +
                "        .container {\n" +
                "            background: var(--bg-secondary);\n" +
                "            padding: 20px;\n" +
                "            border-radius: 12px;\n" +
                "            box-shadow: 0 4px 15px rgba(0,0,0,0.3);\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        h1 { color: #3b82f6; font-size: 24px; }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1><i class=\"fa-solid fa-box-archive\"></i> Z-Archiver Pro</h1>\n" +
                "        <p>مدير ومضغط الملفات جاهز للعمل</p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        webView.loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null);
        setContentView(webView);
    }
}
