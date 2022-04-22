package uz.evkalipt.inputvalidator

import android.widget.EditText
import androidx.core.widget.addTextChangedListener

object InputValidator{

    fun validator(editText1: EditText, editText2: EditText){
        editText2.addTextChangedListener {
            if (editText1.text.toString()!=editText2.text.toString()){
                editText2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_baseline_info_24, 0)
            }else if (editText1.text.toString()==editText2.text.toString()){
                editText2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_baseline_check_24, 0)
            }
        }

        editText1.addTextChangedListener {
            if (editText1.text.toString()!=editText2.text.toString() && editText2.text.toString()!=""){
                editText2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_baseline_info_24, 0)
            }else if (editText1.text.toString()==editText2.text.toString() && editText2.text.toString()!=""){
                editText2.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_baseline_check_24, 0)
            }
        }
    }

}
