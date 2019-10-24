package org.cicipu.cicipukeyboard;

/**
 * Created by Stuart on 09/01/2016.
 */

import android.content.Context;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;

public class CicipuKeyboardView extends KeyboardView {
    public CicipuKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected boolean onLongPress(Key key) {
        if (key.codes[0] == 32) {
            InputMethodManager imeManager = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imeManager != null) {
                imeManager.showInputMethodPicker();
            }
            return true;
        } else {
            return super.onLongPress(key);
        }
    }
}