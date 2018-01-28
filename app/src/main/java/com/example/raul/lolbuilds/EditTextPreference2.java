package com.example.raul.lolbuilds;

import android.content.Context;
import android.preference.EditTextPreference;
import android.text.TextUtils;
import android.util.AttributeSet;

public class EditTextPreference2 extends EditTextPreference {

    public EditTextPreference2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public EditTextPreference2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EditTextPreference2(Context context) {
        super(context);
    }

    // According to ListPreference implementation
    @Override
    public CharSequence getSummary() {
        String text = getText();
        if (TextUtils.isEmpty(text)) {
            CharSequence hint = getEditText().getHint();
            if (!TextUtils.isEmpty(hint)) {
                return hint;
            } else {
                return super.getSummary();
            }
        } else {
            CharSequence summary = super.getSummary();
            if (!TextUtils.isEmpty(summary)) {
                return String.format(summary.toString(), text);
            } else {
                return summary;
            }
        }
    }
}