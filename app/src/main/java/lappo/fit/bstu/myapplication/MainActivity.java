package lappo.fit.bstu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import lappo.fit.bstu.myapplication.text.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extracted();
    }

    private void extracted() {
        MyClass.TextFunction tf = new MyClass.TextFunction();
        TextView nt = findViewById(R.id.newest);
        nt.setText(tf.getValue());
    }
}