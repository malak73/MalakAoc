package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {

    ImageView imageView;
    Button buttonCamera;
    Bitmap bitmap;


    public void onClick(View view) {
        if(view == buttonCamera){
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i, CAMERA_REQUEST);
        }else{

        }
    }

    private static final int CAMERA_REQUEST = 0;

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST &&
            resultCode == CameraActivity.RESULT_OK) {
//the image captured is saved in the data object
            bitmap = (Bitmap) data.getExtras().get("data");
//set image captured to be the new image
            imageView.setImageBitmap(bitmap);
        }
    }




    }

