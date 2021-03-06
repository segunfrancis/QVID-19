package com.project.segunfrancis.qvid19.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.project.segunfrancis.qvid19.domain.entities.BaseResponse
import com.project.segunfrancis.qvid19.domain.entities.QuizData

/**
 * Created by SegunFrancis
 */
@Dao
interface QuizDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuiz(quizData: BaseResponse?)

    @Query("SELECT * FROM quiz_table")
    fun getQuiz(): LiveData<BaseResponse>
}