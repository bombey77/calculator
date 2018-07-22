package bombey77.motovilov.com.calculator.view;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;

import bombey77.motovilov.com.calculator.R;
import bombey77.motovilov.com.calculator.controller.Controller;
import bombey77.motovilov.com.calculator.model.BigDecimalValue;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnPercent, btnRoot, btnXSquare, btnHafXSquare, btnCE, btnC, btnClean, btnSeven,
            btnEight, btnNine, btnFour, btnFive, btnSix, btnOne, btnTwo, btnThree, btnPlusMinus, btnZero, btnComma,
            btnEquals, btnDivide, btnSubtract, btnMinus, btnPlus;

    private BigDecimalValue bigDecimalValue = new BigDecimalValue();
    private StringBuffer stringBufferResult = new StringBuffer();

    private Controller controller = new Controller(bigDecimalValue);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editText.setText(getResources().getString(R.string.btn_zero));
        btnPercent = (Button)findViewById(R.id.btnPercent);
        btnRoot = (Button)findViewById(R.id.btnRoot);
        btnXSquare = (Button)findViewById(R.id.btnXSquare);
        btnHafXSquare = (Button)findViewById(R.id.btnHafXSquare);
        btnCE = (Button)findViewById(R.id.btnCE);
        btnC = (Button)findViewById(R.id.btnC);
        btnClean = (Button)findViewById(R.id.btnClean);
        btnSeven = (Button)findViewById(R.id.btn7);
        btnEight = (Button)findViewById(R.id.btn8);
        btnNine = (Button)findViewById(R.id.btn9);
        btnFour = (Button)findViewById(R.id.btn4);
        btnFive = (Button)findViewById(R.id.btn5);
        btnSix = (Button)findViewById(R.id.btn6);
        btnOne = (Button)findViewById(R.id.btn1);
        btnTwo = (Button)findViewById(R.id.btn2);
        btnThree = (Button)findViewById(R.id.btn3);
        btnPlusMinus = (Button)findViewById(R.id.btnPlusMinus);
        btnZero = (Button)findViewById(R.id.btn0);
        btnComma = (Button)findViewById(R.id.btnComma);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnSubtract = (Button)findViewById(R.id.btnSubtract);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnPlus = (Button)findViewById(R.id.btnPlus);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPercent:
                break;
            case R.id.btnRoot:
                break;
            case R.id.btnXSquare:
                break;
            case R.id.btnHafXSquare:
                break;
            case R.id.btnCE:
                clearStringBuffer();
                editText.setText(getResources().getString(R.string.btn_zero));
                break;
            case R.id.btnC:
                clearStringBuffer();
                editText.setText(getResources().getString(R.string.btn_zero));
                break;
            case R.id.btnClean:
                if (getStringBufferResult().length() != getResources().getInteger(R.integer.ZERO))
                    editText.setText(stringBufferResult.delete(
                            getStringBufferResult().length()-getResources().getInteger(R.integer.ONE),
                            getStringBufferResult().length()));
                    if (getStringBufferResult().length() == getResources().getInteger(R.integer.ZERO))
                        editText.setText(getResources().getString(R.string.btn_zero));
                break;

            case R.id.btn0:
                addDigets(getResources().getString(R.string.btn_zero));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn1:
                addDigets(getResources().getString(R.string.btn_one));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn2:
                addDigets(getResources().getString(R.string.btn_two));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn3:
                addDigets(getResources().getString(R.string.btn_three));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn4:
                addDigets(getResources().getString(R.string.btn_four));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn5:
                addDigets(getResources().getString(R.string.btn_five));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn6:
                addDigets(getResources().getString(R.string.btn_six));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn7:
                addDigets(getResources().getString(R.string.btn_seven));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn8:
                addDigets(getResources().getString(R.string.btn_eight));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btn9:
                addDigets(getResources().getString(R.string.btn_nine));
                editText.setText(getStringBufferResult());
                break;
            case R.id.btnPlusMinus:
                break;
            case R.id.btnComma:
                break;
            case R.id.btnEquals:
                break;


            case R.id.btnDivide:
            case R.id.btnSubtract:
            case R.id.btnMinus:
            case R.id.btnPlus:
//                Controller controller = new Controller(bigDecimalValue);
//                controller.operation(new BigDecimal(editText.getText().toString()),
//            controller.operation(new BigDecimal(10),
//                    BigDecimalValue.OperationType.ADD);
            clearStringBuffer();
            System.out.println("----------------- ADD pressed ---------------");

            MyAsyncTask myAsyncTask = new MyAsyncTask();
            myAsyncTask.execute();
//            myAsyncTask.doInBackground("10");
//            myAsyncTask.onPostExecute("11");
            break;
        }
    }

    public StringBuffer addDigets(String number) {
        stringBufferResult.append(number);
        return stringBufferResult;
    }

    public void clearStringBuffer() {stringBufferResult.delete(0, stringBufferResult.length());}

    public StringBuffer getStringBufferResult() {
        return stringBufferResult;
    }

    class MyAsyncTask extends AsyncTask<Void, Void, BigDecimal> {

        @Override
        protected BigDecimal doInBackground(Void... voids) {
            controller.operation(new BigDecimal(editText.getText().toString()),
                    BigDecimalValue.OperationType.ADD);
            return controller.getResult();
        }

        @Override
        protected void onPostExecute(BigDecimal aVoid) {
            super.onPostExecute(aVoid);
            editText.setText(aVoid.toString());
            System.out.println("==============  ================= " + aVoid);
        }
    }
}
