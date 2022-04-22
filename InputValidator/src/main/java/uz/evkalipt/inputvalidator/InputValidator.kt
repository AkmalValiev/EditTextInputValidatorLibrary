package uz.evkalipt.inputvalidator

import android.widget.EditText
import androidx.core.widget.addTextChangedListener

object InputValidator{

    fun validator(str1:String, editText: EditText){
        editText.addTextChangedListener {
            if (str1!=editText.text.toString()){
                editText.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_baseline_info_24, 0)
            }else if (str1==editText.text.toString()){
                editText.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.ic_baseline_check_24, 0)
            }
        }
    }

}
