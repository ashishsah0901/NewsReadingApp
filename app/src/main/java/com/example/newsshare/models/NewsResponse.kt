package com.example.newsshare.models

import com.example.newsshare.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)