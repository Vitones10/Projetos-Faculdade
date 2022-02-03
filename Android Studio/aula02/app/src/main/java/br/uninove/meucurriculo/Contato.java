package br.uninove.meucurriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Contato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
    }

    public void enviarEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Assunto do email");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "corpo do Email");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    public void efetuarLigacao(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: " + "991283912"));
        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        startActivity(callIntent);
    }
}
