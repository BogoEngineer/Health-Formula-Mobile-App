package com.veskekatke.healthformula.presentation.view.recycler.viewholder

import android.net.Uri
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.veskekatke.healthformula.R
import com.veskekatke.healthformula.data.models.post.Post
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.layout_post_list_item.view.*
import timber.log.Timber

class PostViewHolder (
    override val containerView: View,
    onItemClicked: (Int) -> Unit
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    init {
        containerView.setOnClickListener{
            onItemClicked.invoke(adapterPosition)
        }
    }

    fun bind(post: Post){
        Picasso
            .get()
            .load(Uri.parse(post.picture))
            .error(R.drawable.no_image_found)
            .into(containerView.postPictureIv)

        containerView.findViewById<TextView>(R.id.postTitleTv).text = post.name
        containerView.findViewById<TextView>(R.id.postContentTv).text =
            if(post.content.length > 80) post.content.substring(0, 80)+"..." else post.content
    }
}