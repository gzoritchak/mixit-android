package org.mixitconf.model

import org.mixitconf.R


data class Link(
        val name: String,
        val url: String
)

enum class Social(val pattern: String, val resourceId: Int) {
    TWITTER("twitter", R.drawable.mxt_icon_twitter_zoom),
    GITHUB("github", R.drawable.mxt_icon_github_zoom),
    LINKEDIN("linkedin", R.drawable.mxt_icon_linkedin_zoom)
}