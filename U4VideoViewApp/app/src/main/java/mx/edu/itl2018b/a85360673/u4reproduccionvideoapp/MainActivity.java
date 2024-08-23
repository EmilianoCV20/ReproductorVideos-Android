package mx.edu.itl2018b.a85360673.u4reproduccionvideoapp;

import android.content.Intent;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String ruta;

    //----------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //----------------------------------------------------------------------------------------------

    public void btnDesdeAppClick ( View v ) {
        // Reproducir un video incluido en la app en la carpeta raw
        ruta = "android.resource://" + this.getPackageName() + "/" + R.raw.fish_spinning;
        lanzarVideoActiviy ();
    }

    //----------------------------------------------------------------------------------------------

    public void btnDesdeInternetClick ( View v ) {
        // Reproducir un video desde internet
        //ruta = "http://secundaria.universoft.com.mx/clip_salvadas_en_la_linea.mp4";
        ruta = "https://rr4---sn-o097znzd.googlevideo.com/videoplayback?expire=1699985044&ei=" +
                "M2JTZefjPOeysfIPhsSCwAI&ip=2600%3A3c01%3A%3Af03c%3A93ff%3Afea8%3A1183&id=o-AOY" +
                "-L77Zyh8VvXnBoorX_9Ib-5CoQQNibIK_0cJ0fts9&itag=18&source=youtube&requiressl=" +
                "yes&mh=9Y&mm=31%2C29&mn=sn-o097znzd%2Csn-n4v7snly&ms=au%2Crdu&mv=m&mvi=4&pl=" +
                "32&initcwndbps=1143750&vprv=1&mime=video%2Fmp4&cnr=14&ratebypass=yes&dur=" +
                "10.727&lmt=1665189802189590&mt=1699963046&fvip=4&fexp=24007246&beids=2435" +
                "0018&c=ANDROID_TESTSUITE&txp=5438434&sparams=expire%2Cei%2Cip%2Cid%2Citag%" +
                "2Csource%2Crequiressl%2Cvprv%2Cmime%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=" +
                "ANLwegAwRQIgNuutsjRD8WR-8q3u5SsfIvldJMPdJroVGKeUztUR6R4CIQD_asKy7UXgWiiQT" +
                "B5ePwUp7Jm4J3NVU6KYgtpWnpk8zg%3D%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%" +
                "2Cpl%2Cinitcwndbps&lsig=AM8Gb2swRgIhAIgPAOVjVdkR5AUWhnj_EMHRdd43WMD1cpx4giD" +
                "WdZq2AiEA9slSFBlsreB39cKpz4raFPwKybAJj5tgg5U53VTo4KE%3D";
        lanzarVideoActiviy ();
    }

    //----------------------------------------------------------------------------------------------

    public void btnDesdeAlmIntClick ( View v ) {
        // Reproducir un video en la carpeta DCIM del almacenamiento interno
        ruta = "file://" + Environment.getExternalStorageDirectory()
                .getPath() + "/DCIM/homero_bailando.mp4";
        lanzarVideoActiviy ();
    }

    //----------------------------------------------------------------------------------------------

    private void  lanzarVideoActiviy () {
        Intent intent = new Intent ( this, VideoActivity.class ) ;
        intent.putExtra ( "rutaVideo", ruta );
        startActivity ( intent );
    }

    //----------------------------------------------------------------------------------------------

    public void btnAcercadeClick ( View v ) {
        Intent intent  = new Intent ( this, AcercaDe.class );
        startActivity ( intent );
        finish();
    }

}
