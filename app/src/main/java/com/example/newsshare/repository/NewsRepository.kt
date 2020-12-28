package com.example.newsshare.repository

import com.example.newsshare.api.RetrofitInstance
import com.example.newsshare.db.ArticleDatabase
import com.example.newsshare.models.Article

class NewsRepository(
    val db:ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode:String,pageNumber:Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
    suspend fun searchNews(searchQuery: String,pageNumber: Int)=
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
    suspend fun upsert(article:Article)=db.getArticleDao().upsert(article)
    fun getSavedNews()=db.getArticleDao().getAllArticles()
    suspend fun deleteArticle(article: Article)=db.getArticleDao().deleteArticle(article)
}