package br.com.fernandescruz.toastlibrary;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by claudiocruz on 17/12/16.
 */

public class CustomToast {
    public static void showErro(Activity activity, String texto, int tempo) {
        showMessage(activity, R.layout.toast_erro, texto, tempo);
    }

    public static void showInfo(Activity activity, String texto, int tempo) {
        showMessage(activity, R.layout.toast_info, texto, tempo);
    }

    public static void showWarning(Activity activity, String texto, int tempo) {
        showMessage(activity, R.layout.toast_atencao, texto, tempo);
    }

    private static void showMessage(Activity activity, int layout, String texto, int tempo) {
        Context context = activity;
        LayoutInflater inflater = activity.getLayoutInflater();

        View customToastroot =inflater.inflate(layout, null);

        TextView textView1 = (TextView)customToastroot.findViewById(R.id.textView1);

        Toast customtoast = new Toast(context);

        textView1.setText(texto);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL |
                Gravity.BOTTOM,0, 0);
        customtoast.setDuration(tempo);
        customtoast.show();
    }}
