package com.example.affirmations2

import android.content.Context
import com.example.affirmations2.adapter.ItemAdapter
import com.example.affirmations2.model.Affirmation
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test

    fun adapter_size() {

        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val size = ItemAdapter(context, data).itemCount

        assertEquals("size doesn't matches", size, data.size)
    }


}