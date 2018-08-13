package bombey77.motovilov.com.calculator.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bombey77.motovilov.com.calculator.R;
import bombey77.motovilov.com.calculator.model.Values;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnPercent, btnRoot, btnXSquare, btnHafXSquare, btnCE, btnC, btnClean, btnPlusMinus, btnComma,
            btnEquals, btnDivide, btnSubtract, btnMinus, btnPlus;

    private Values values;
//    private Values.OperationType operationType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        values = new Values();


        editText = findViewById(R.id.editText);
        editText.setText(getResources().getString(R.string.btn_zero));
        btnPercent = findViewById(R.id.btnPercent);
        btnRoot = findViewById(R.id.btnRoot);
        btnXSquare = findViewById(R.id.btnXSquare);
        btnHafXSquare = findViewById(R.id.btnHafXSquare);
        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnClean = findViewById(R.id.btnClean);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);
        btnComma = findViewById(R.id.btnComma);
        btnEquals = findViewById(R.id.btnEquals);
        btnDivide = findViewById(R.id.btnDivide);
        btnSubtract = findViewById(R.id.btnMultyply);
        btnMinus = findViewById(R.id.btnSubtract);
        btnPlus = findViewById(R.id.btnPlus);
    }

    /**
    Get event if any button was clicked.
     */
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnCE:
                break;
            case R.id.btnC:
            case R.id.btnClean:
                break;

            case R.id.btnPlusMinus:
                break;
            case R.id.btnEquals:
                break;

            case R.id.btnDivide:
                break;

            case R.id.btnMultyply:
                break;

            case R.id.btnSubtract:
                break;

            case R.id.btnPlus:

                break;

            default:
                if (editText.getText().toString().equals("0")) {
                    editText.setText(view.getContentDescription().toString());
                } else {
                    editText.setText(editText.getText() + view.getContentDescription().toString());
                }
                break;
        }


    }

}
