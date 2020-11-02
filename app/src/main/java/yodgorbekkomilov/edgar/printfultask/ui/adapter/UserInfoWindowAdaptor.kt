package yodgorbekkomilov.edgar.printfultask.ui.adapter

import android.app.Activity
import android.content.Context
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import kotlinx.android.synthetic.main.layout_info_window.view.*
import yodgorbekkomilov.edgar.printfultask.R
import yodgorbekkomilov.edgar.printfultask.model.User

class UserInfoWindowAdaptor(private val context: Context) : GoogleMap.InfoWindowAdapter {

    override fun getInfoWindow(marker: Marker): View? {
        return null
    }

    override fun getInfoContents(marker: Marker): View {
        val view: View =
            (context as Activity).layoutInflater.inflate(R.layout.layout_info_window, null)
        val infoWindowData: User? = marker.tag as User?

        infoWindowData?.let {
            view.tvName.text = infoWindowData.userName
            view.tvAddress.text = "${infoWindowData.lat} ${infoWindowData.lng}"

            Glide.with(view.ivUser)
                .load(infoWindowData.image)
                .placeholder(R.mipmap.ic_launcher)
                .apply(RequestOptions().override(100, 100))
                .into(view.ivUser)
        }

        return view
    }

}
