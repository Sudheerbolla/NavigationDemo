package com.navigationdemo.model

import android.text.Html
import org.json.JSONObject

data class Step(val jsonObject: JSONObject) {
    var direction: String =
        Html.fromHtml(jsonObject.getString("html_instructions"), Html.FROM_HTML_MODE_LEGACY)
            .toString()
}
